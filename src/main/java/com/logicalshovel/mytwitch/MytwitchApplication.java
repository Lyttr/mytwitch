package com.logicalshovel.mytwitch;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MytwitchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytwitchApplication.class, args);
	}

}
