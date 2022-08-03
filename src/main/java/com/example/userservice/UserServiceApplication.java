package com.example.userservice;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication

public class UserServiceApplication {



    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);


    }



}
