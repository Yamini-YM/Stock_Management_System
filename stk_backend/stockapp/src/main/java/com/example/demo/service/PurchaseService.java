package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Purchase;
import com.example.demo.repository.PurchaseRepository;




@Service
public class PurchaseService {
@Autowired
private PurchaseRepository rep;

public List<Purchase> addDetails(List<Purchase> Purchase) {
        return rep.saveAll(Purchase);
    }

}