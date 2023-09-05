package com.jatin.ProductDemoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDB db;

//    public void addProduct(Product product) {
//        db.save(product);
//    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

//    public Product getProduct(String name) {
//        return db.getProduct(name);
//    }
//
//
//    public List<Product> getProductWithText(String inputText) {
//        String text = inputText.toLowerCase();
//        return db.getProductWithText(text);
//    }
//
//    public List<Product> getProductByPlace(String inputText) {
//        String text = inputText.toLowerCase();
//        return db.getProductsByPlace(text);
//    }
//
//    public List<Product> getProductOutOfWarranty(int year) {
//        return db.getProductsOutOfWarranty(year);
//    }
}
