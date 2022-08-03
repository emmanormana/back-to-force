package com.example.userservice.controller;


import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/allUsers")
    public List<User> getUsers(){
      return this.userRepository.findAll();
    }

    @PostMapping("/saveUsers")
    public void getUsers(@RequestBody User user){
         userRepository.save(user);
    }
}
