package com.haloz.springonlinestore.repository;

import com.haloz.springonlinestore.entities.StoreProduct;
import com.haloz.springonlinestore.handler.ExceptionsHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Repository
@SessionScope
public class StoreCart {
    private final static Logger LOGGER = LoggerFactory.getLogger(StoreCart.class);
    private final Map<Integer, StoreProduct> products;

    public StoreCart() {
        this.products = new HashMap<>();
        LOGGER.info("Store cart is created.");

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
        LOGGER.info("Product(s) added in cart.");
    }
    @NonNull
    public StoreProduct getProduct(Integer id) {
        LOGGER.info("Product is got.");
        return products.get(id);
    }
    public Map<Integer, StoreProduct> getProducts() {
        LOGGER.info("Products list is got.");
        return products;
    }
}
