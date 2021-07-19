package com.sda.lectia5.collections.map;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String description;
    private List<String> tags;

    public Product(String name, String description, List<String> tags) {
        this.name = name;
        this.description = description;
        this.tags = tags;
    }

    public Product(String name, String description) {
        this(name, description, new ArrayList());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String toString() {
        return "Product{name='" + this.name + '\'' + ", description='" + this.description + '\'' + ", tags=" + this.tags + '}';
    }
}
