package com.ad.entities;

import lombok.Data;

/**
 * @Author AdrainHuang
 * @Date 2019/10/13 00:58
 **/
@Data
public class User {
	private Long id;
	private String username;
	
	public User(Long id, String username) {
		this.id = id;
		this.username = username;
	}
	
	public User() {
	}
}
