package com.userservice.controller;

import com.userservice.dao.UserRepo;
import com.userservice.entity.User;

import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1=userService.createUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }
    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> userList=userService.getAllUser();
        return new ResponseEntity<>(userList,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user ){
        User Updateduser=userService.updateUser(user);

        return new ResponseEntity<>(Updateduser,HttpStatus.OK);
        }

}
