package com.springmongodbjavatechie.springmongodbjavatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringmongodbjavatechieApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmongodbjavatechieApplication.class, args);
	}

}
