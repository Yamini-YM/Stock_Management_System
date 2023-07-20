package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Signin;
import com.example.demo.repository.SignupRepository;

@Service

public class SignupService {
@Autowired

public SignupRepository repo;
public Signin addDetails(Signin sign) {
return repo.save(sign);
}


}