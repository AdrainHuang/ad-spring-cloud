package com.ad;

import com.ad.services.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * @Author AdrainHuang
 * @Date 2019/10/13 18:55
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CustomerClientApplication.class)
@AutoConfigureStubRunner(ids = "com.adrain:ad-spring-cloud-contract-producer:+:8081", stubsMode = StubRunnerProperties.StubsMode.LOCAL)
@ActiveProfiles("test")
public class CustomerClienTest  {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void getUserInfo() throws Exception {
		ResponseEntity userInfo = userService.getUserInfo(2L);
		Map user = (Map) userInfo.getBody();
		Assert.assertEquals(HttpStatus.OK, userInfo.getStatusCode());
		Assert.assertEquals("adrain", user.get("username"));
	}
}
