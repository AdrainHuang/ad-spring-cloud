package com.adrain.adspcloudhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author AdrainHuang
 * @Date 2019/2/27 上午12:39
 **/
@RestController
public class HystrixController {
	
	private static Random random = new Random();
	
	@GetMapping("helloworld")
	@HystrixCommand(fallbackMethod = "erroContent",
		commandProperties = { @HystrixProperty(
			name = "execution.isolation.thread.timeoutInMilliseconds",
			value = "100"
		
		)}
	)
	public String hellworld() throws InterruptedException {
		int i = random.nextInt(200);
		System.out.println("helloword() cost"+i +".ms");
		Thread.sleep(i);
		return "hello word";
	}
	
	public String erroContent(){
		return "error timeout";
	}
}
