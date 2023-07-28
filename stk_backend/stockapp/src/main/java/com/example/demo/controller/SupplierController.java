package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Supplier;
import com.example.demo.service.SupplierService;



@RestController
@CrossOrigin(origins="http://localhost:3000/")
public class SupplierController {
@Autowired
private SupplierService ser;

@PostMapping("/Supplier")
    public List<Supplier> postDetails(@RequestBody List<Supplier> Supplier) {
        return ser.addDetails(Supplier);
    }

}
