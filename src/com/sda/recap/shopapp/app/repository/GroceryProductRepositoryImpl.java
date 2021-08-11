package com.sda.recap.shopapp.app.repository;

import com.sda.recap.shopapp.app.model.product.GroceryProduct;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GroceryProductRepositoryImpl extends SellableRepositoryImpl<GroceryProduct> implements GroceryProductRepo {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("mm/dd/yyyy");
    public void loadAll() throws IOException {
        Path path = Paths.get("/Users/bmx8/Sda_Java_Advanced/src/com/sda/recap/shopapp/data/groceries.csv");
        Files.lines(path)
                .skip(1)
                .filter(line -> line != null)
                .filter(line -> !line.isEmpty())
                .map(line -> {
                    try {
                        String[] arrayElem = line.split("\\|");
                        String id = arrayElem[0];
                        double price = Double.parseDouble(arrayElem[1]);
                        String currency = arrayElem[2];
                        String name = arrayElem[3];
                        String description = arrayElem[4];
                        Date expirationDate = DATE_FORMAT.parse(arrayElem[5]);
                        boolean isBio = Boolean.parseBoolean(arrayElem[6]);
                        String countryOfOrigin = arrayElem[7];
                        System.out.println(expirationDate);
                        return new GroceryProduct(expirationDate,
                                isBio,
                                countryOfOrigin,
                                id,
                                price,
                                currency,
                                name,
                                description
                        );
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                })
                .filter(petFoodProduct -> petFoodProduct != null)
                .forEach(petFoodProduct -> add(petFoodProduct));
    }
}
