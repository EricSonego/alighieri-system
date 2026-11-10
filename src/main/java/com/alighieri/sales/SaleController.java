package com.alighieri.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private SaleRepository saleRepository;

    // get all sales
    public ResponseEntity<List<SaleModel>> getAllSales() {
        return ResponseEntity.status(HttpStatus.CREATED).body(saleRepository.findAll());
    }

    // post sale
    public ResponseEntity<SaleModel> saveSale(@RequestBody SaleModel saleModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(saleRepository.save(saleModel));
    }
}