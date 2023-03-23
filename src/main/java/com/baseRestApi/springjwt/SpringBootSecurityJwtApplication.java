package com.baseRestApi.springjwt;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 
 * @author yann.bundy
 *
 */
@SpringBootApplication
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootSecurityJwtApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "9090"));
        app.run(args);
	}

}
