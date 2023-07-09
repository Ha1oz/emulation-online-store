package com.haloz.springonlinestore.entities;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class StoreProduct {
    private final Integer id;
    private final String name;
    @NonNull
    public StoreProduct(Integer id) {
        this.id = id;
        this.name = "product_" + id.toString();
    }
    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                '}';
    }
}
