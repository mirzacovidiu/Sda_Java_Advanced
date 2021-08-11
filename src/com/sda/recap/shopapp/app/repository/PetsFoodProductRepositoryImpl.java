package com.sda.recap.shopapp.app.repository;

import com.sda.recap.shopapp.app.model.product.GroceryProduct;
import com.sda.recap.shopapp.app.model.product.PetsFoodProduct;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PetsFoodProductRepositoryImpl extends
        SellableRepositoryImpl<PetsFoodProduct>
        implements PetsFoodProductRepo{

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("mm/dd/yyyy");

    public PetsFoodProductRepositoryImpl() throws IOException {

        Path path = Paths.get("/Users/bmx8/Sda_Java_Advanced/src/com/sda/recap/shopapp/data/petfood.csv");
        Files.lines(path)
                .skip(1)
                .filter(line -> line != null)
                .filter(line -> !line.isEmpty())
                .map(line -> {
                    try {
                        String[] arrayElem = line.split("\\|");
                        return new PetsFoodProduct(DATE_FORMAT.parse(arrayElem[5]),
                                Boolean.parseBoolean(arrayElem[6]),
                                arrayElem[7],
                                arrayElem[2],
                                Double.parseDouble(arrayElem[1]),
                                arrayElem[3],
                                arrayElem[4],
                                arrayElem[0]
                        );
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                })
                .filter(groceryProduct -> groceryProduct != null)
                .forEach(groceryProduct -> add(groceryProduct));
    }

}
