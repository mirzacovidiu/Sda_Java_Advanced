/*
package com.sda.recap.shopapp.app.repository;


import com.sda.recap.shopapp.app.model.product.FoodProduct;

import java.awt.*;
import java.util.stream.Collectors;

public class FoodProductRepo<T extends FoodProduct> extends SellableRepositoryImpl<T> {
    public FoodProductRepo() {
    }

    public List<T> getAllBioProducts() {
        return (List)this.sellableMap.values().stream().filter((product) -> {
            return product.isBio();
        }).collect(Collectors.toList());
    }
}
*/
