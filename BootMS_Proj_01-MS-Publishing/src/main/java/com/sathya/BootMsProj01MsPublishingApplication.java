package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BootMsProj01MsPublishingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj01MsPublishingApplication.class, args);
	}

}
