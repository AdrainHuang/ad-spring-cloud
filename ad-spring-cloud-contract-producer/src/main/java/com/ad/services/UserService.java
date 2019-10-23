package com.ad.services;

import com.ad.entities.User;
import org.springframework.stereotype.Service;

/**
 * @Author AdrainHuang
 * @Date 2019/10/13 00:59
 **/
@Service
public class UserService {
	
	public User getUser(Long id) {
		return new User(1L, "acey");
	}
	
	public void addUser(User user) {
	
	}
}