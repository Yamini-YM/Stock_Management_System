package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Purchase;
import com.example.demo.service.PurchaseService;



@RestController
@CrossOrigin(origins="http://localhost:3000/")
public class PurchaseController {
@Autowired
private PurchaseService ser;

@PostMapping("/Purchase")
    public List<Purchase> postDetails(@RequestBody List<Purchase> Purchase) {
        return ser.addDetails(Purchase);
    }

}
