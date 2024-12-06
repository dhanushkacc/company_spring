package org.example.controller;

import org.example.dto.UserDTO;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/api/v1/")


public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/users")
    public List<UserDTO> users(){
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }
}
