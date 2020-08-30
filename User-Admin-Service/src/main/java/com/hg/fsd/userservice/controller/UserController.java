package com.hg.fsd.userservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hg.fsd.userservice.dtos.UserRequestModel;
import com.hg.fsd.userservice.dtos.UserResponseModel;
import com.hg.fsd.userservice.service.UserService;

@RestController
public class UserController {
	 	UserService userService;

	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @GetMapping("/test")
	    public String test() {
	        return "user service is working";
	    }

	    @PostMapping("/register")
	    public ResponseEntity<UserResponseModel> createAccount(@RequestBody UserRequestModel userRequestModel) {
	        UserResponseModel user = userService.addUser(userRequestModel);
	        return ResponseEntity.status(HttpStatus.CREATED).body(user);
	    }

	    @PatchMapping("/updateInfo")
	    public ResponseEntity<UserResponseModel> updateUserInfo(@RequestBody UserRequestModel userRequestModel) {
	        UserResponseModel user = userService.updateUser(userRequestModel);
	        return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
	    }
}
