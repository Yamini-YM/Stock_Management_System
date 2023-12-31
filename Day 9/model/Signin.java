package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Signin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String name;
	private String email;
	private String password;
	private String confirm;
	private String contactno;
	
}
