package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Supplier;
import com.example.demo.repository.SupplierRepository;




@Service
public class SupplierService {
@Autowired
private SupplierRepository rep;

public List<Supplier> addDetails(List<Supplier> Supplier) {
        return rep.saveAll(Supplier);
    }

}