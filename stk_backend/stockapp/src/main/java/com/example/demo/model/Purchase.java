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

public class Purchase {

	@Id
	
	private int id;
	private int SupplierId;
	private int ProductId;
	private int NumberReceived;
	private String PurchaseDate;
}
