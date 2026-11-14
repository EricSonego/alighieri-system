package com.alighieri.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    // get all products
    @GetMapping("/consult")
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.findAll());
    }

    // post products
    @PostMapping("/register")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody ProductModel productModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }
}