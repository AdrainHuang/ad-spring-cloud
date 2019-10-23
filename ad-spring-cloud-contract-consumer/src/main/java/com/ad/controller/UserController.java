package com.ad.controller;

import com.ad.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author AdrainHuang
 * @Date 2019/10/13 18:27
 **/
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users/{id}")
	public ResponseEntity getUser(@PathVariable Long id) {
		return new ResponseEntity(userService.getUserInfo(id), HttpStatus.OK);
	}
}
