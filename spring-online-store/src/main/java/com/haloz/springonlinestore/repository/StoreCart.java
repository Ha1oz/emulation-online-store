package com.haloz.springonlinestore.repository;

import com.haloz.springonlinestore.entities.StoreProduct;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
@Repository
@SessionScope
public class StoreCart {
    private final Map<Integer, StoreProduct> products;

    public StoreCart() {
        this.products = new HashMap<>();
    }
    @NonNull
    public void addProduct(Integer... productsId) {
        Arrays.stream(productsId)
                .forEach((productId -> {
                    // TO DO: It doesn't need more logic now. Yet.
                    if (products.containsKey(productId)) {
                        return;
                    }
                    products.put(productId, new StoreProduct(productId));

                }));
    }
    @NonNull
    public StoreProduct getProduct(Integer id) {
        return products.get(id);
    }
    public Map<Integer, StoreProduct> getProducts() {
        return products;
    }
}
