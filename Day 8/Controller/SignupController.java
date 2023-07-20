package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Signin;

import com.example.demo.Service.SignupService;

@RestController

@CrossOrigin(origins="http://localhost:3000/")

public class SignupController {

@Autowired
public SignupService service;
@PostMapping("/sign")
public Signin  postDetails(@RequestBody Signin sign) {
return service.addDetails(sign);
}

}
