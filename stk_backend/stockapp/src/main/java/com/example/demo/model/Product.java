package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {
	
	@Id
	
	private int id;
    private String ProductName;
    private int InventoryReceived;
    private int InventoryShipped;
    private int InventoryOnHand;

}
