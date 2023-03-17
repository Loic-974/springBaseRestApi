package com.expert.baseRestApi;

import java.util.Collections;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseRestApiApplication {

	public static void main(String[] args) {
		  SpringApplication app = new SpringApplication(BaseRestApiApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "9090"));
	        app.run(args);
	}
}
