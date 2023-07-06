package com.haloz.springonlinestore.service;

import com.haloz.springonlinestore.repository.StoreCart;
import com.haloz.springonlinestore.entities.StoreProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final static Logger LOGGER = LoggerFactory.getLogger(StoreService.class);
    @Autowired
    private StoreCart storeCart;
    public void addProduct(Integer... productsId) {
        storeCart.addProduct(productsId);
        LOGGER.info("Product(s) added.");
    }
    public StoreProduct getProduct(Integer id) {
        StoreProduct storeProduct = storeCart.getProduct(id);
        LOGGER.info("Product is got.");
        return storeProduct;
    }
    public List<StoreProduct> getProductsList() {
        List<StoreProduct> res = storeCart.getProducts().values().stream().toList();
        LOGGER.info("Product list is got.");
        return res;
    }

}
