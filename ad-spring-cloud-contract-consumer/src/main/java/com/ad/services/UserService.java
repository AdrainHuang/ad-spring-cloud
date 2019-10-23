package com.ad.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Author AdrainHuang
 * @Date 2019/10/13 18:28
 **/
@Service
public class UserService {
	@Value("${userCenter}")
	private String userCenterUrl;
	
	public ResponseEntity getUserInfo(Long userId) {
		String getUsersUrl = userCenterUrl + "/users/" + userId;
		
		RestTemplate template = new RestTemplate();
		ResponseEntity<Map> result = template.getForEntity(getUsersUrl, Map.class);
		return result;
	}
}
