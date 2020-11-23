package com.rakesh.springsteps.controller;

import com.rakesh.springsteps.model.User;
import com.rakesh.springsteps.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    private List<User> getAllUsers() throws Exception
    {
        return userRepository.findAll();
    }
}
