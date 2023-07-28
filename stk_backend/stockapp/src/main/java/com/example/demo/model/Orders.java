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

public class Orders {
	
	@Id
	
	private int id;
    private String Title;
    private int ProductId;
    private int NumberShipped;
    private String OrderDate;

}
