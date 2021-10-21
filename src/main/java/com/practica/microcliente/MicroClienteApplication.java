package com.practica.microcliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroClienteApplication.class, args);
	}

}
