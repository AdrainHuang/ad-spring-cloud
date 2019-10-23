package com.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

/**
 * @Author AdrainHuang
 * @Date 2019/10/13 18:25
 **/
@SpringBootApplication
public class CustomerClientApplication {
	public static void main(String[] args) {
		System.out.println("consumer : Using spring contract..." + new Date().getTime());
		SpringApplication.run(CustomerClientApplication.class, args);
	}
}
