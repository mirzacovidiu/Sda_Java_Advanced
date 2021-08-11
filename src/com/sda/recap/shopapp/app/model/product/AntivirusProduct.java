package com.sda.recap.shopapp.app.model.product;

public class AntivirusProduct extends SoftwareProduct{

    private String id;
    private Double price;
    private String currency;
    private String name;
    private String description;

    public AntivirusProduct(boolean receivedOnMail,
                            boolean sentOnDvdDisk,
                            String licenseType,
                            String releasedBy,
                            String id,
                            Double price,
                            String currency,
                            String name,
                            String description
                            ) {
        super(receivedOnMail,
                sentOnDvdDisk,
                licenseType,
                releasedBy);
        this.id = id;
        if (price != null && price > 0){
            this.price = price;
        }else {
            throw new IllegalArgumentException("Invalid Price");
        }
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getProductCategory() {
        return getSoftwareProductCategory();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
