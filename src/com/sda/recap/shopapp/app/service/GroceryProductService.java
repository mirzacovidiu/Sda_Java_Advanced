/*package com.sda.recap.shopapp.app.service;

import com.sda.recap.shopapp.app.repository.GroceryProductRepo;
import com.sda.recap.shopapp.app.repository.GroceryProductRepositoryImpl;

import java.io.IOException;

public class GroceryProductService {
    private final GroceryProductRepo productRepo = new GroceryProductRepositoryImpl();

    public GroceryProductService() throws IOException {
        try {
            this.productRepo.loadAll();
        } catch (IOException var2) {
            System.out.println("Fisierul nu a fost gasit");
            var2.printStackTrace();
        }

    }

    public Optional<GroceryProducts> search(String name) {
        return this.productRepo.search(name);
    }

    public List<GroceryProducts> viewAllOrderedByPrice() {
        return this.productRepo.getAllOrderedByPrice();
    }

    public void buyProduct(String name) {
        this.productRepo.search(name);
        this.productRepo.remove(name);
    }
}*/
