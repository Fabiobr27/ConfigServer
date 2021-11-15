package com.example.microServiciosClient;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication

public class MicroserviciosCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosCloudApplication.class, args);
	}

}
