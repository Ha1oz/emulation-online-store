package com.haloz.springonlinestore.controller;

import com.haloz.springonlinestore.entities.StoreProduct;
import com.haloz.springonlinestore.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class StoreController {
    @Autowired
    private StoreService storeService;
    @GetMapping("/add")
    public void addProductToCart(@RequestParam Integer... id) {
        storeService.addProduct(id);
    }
    @GetMapping("/get")
    public List<StoreProduct> addProductToCart() {
        return storeService.getProductsList();
    }
}
