package com.alighieri.sales;

import com.alighieri.employees.EmployeeModel;
import com.alighieri.employees.EmployeeRepository;
import com.alighieri.products.ProductModel;
import com.alighieri.products.ProductRepository;
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

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    // get all sales
    @GetMapping
    public ResponseEntity<List<SaleModel>> getAllSales() {
        return ResponseEntity.status(HttpStatus.OK).body(saleRepository.findAll());
    }

    // post sale
    @PostMapping("/register")
    public ResponseEntity<SaleModel> saveSale(@RequestBody SaleModel saleModel) {

        Integer idEmp = saleModel.getEmployee().getId();
        Integer idProd = saleModel.getProduct().getId();

        EmployeeModel employee = employeeRepository.findById(idEmp.longValue())
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        ProductModel product = productRepository.findById(idProd.longValue())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        saleModel.setEmployee(employee);
        saleModel.setProduct(product);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saleRepository.save(saleModel));
    }
}