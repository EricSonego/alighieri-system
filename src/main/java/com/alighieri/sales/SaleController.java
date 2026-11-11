package com.alighieri.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private SaleRepository saleRepository;

    // get all sales
    @GetMapping
    public ResponseEntity<List<SaleModel>> getAllSales() {
        return ResponseEntity.status(HttpStatus.OK).body(saleRepository.findAll());
    }

    // post sale
    @PostMapping
    public ResponseEntity<SaleModel> saveSale(@RequestBody SaleModel saleModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(saleRepository.save(saleModel));
    }
}