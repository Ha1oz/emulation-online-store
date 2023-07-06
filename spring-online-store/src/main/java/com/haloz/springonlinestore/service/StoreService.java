package com.haloz.springonlinestore.service;

import com.haloz.springonlinestore.repository.StoreCart;
import com.haloz.springonlinestore.entities.StoreProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreCart storeCart;
    public void addProduct(Integer... productsId) {
        storeCart.addProduct(productsId);
    }
    public StoreProduct getProduct(Integer id) {
        return storeCart.getProduct(id);
    }
    public List<StoreProduct> getProductsList() {
        return storeCart.getProducts().values().stream().toList();
    }

}
