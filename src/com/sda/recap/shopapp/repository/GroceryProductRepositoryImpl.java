package com.sda.recap.shopapp.repository;

import com.sda.recap.shopapp.model.GroceryProduct;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GroceryProductRepositoryImpl extends SellableRepositoryImpl<GroceryProduct> implements GroceryProductRepo {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("mm/dd/yyyy");

    public GroceryProductRepositoryImpl() throws IOException {

        Path path = Paths.get("/Users/bmx8/Sda_Java_Advanced/src/groceries.csv");
        Files.lines(path)
                .skip(1)
                .filter(line -> line != null)
                .filter(line -> !line.isEmpty())
                .map(line -> {
                    try {
                        String[] arrayElem = line.split("\\|");
                        return new GroceryProduct(DATE_FORMAT.parse(arrayElem[5]),
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
