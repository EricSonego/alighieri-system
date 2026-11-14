package com.alighieri.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    // get all emnployees
    @GetMapping("/consult")
    public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeRepository.findAll());
    }

    // post employees
    @PostMapping("/register")
    public ResponseEntity<EmployeeModel> saveEmployee(@RequestBody EmployeeModel employeeModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeRepository.save(employeeModel));
    }
}