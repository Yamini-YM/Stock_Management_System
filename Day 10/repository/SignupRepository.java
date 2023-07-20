package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Signin;


public interface SignupRepository extends JpaRepository<Signin, String> {

}