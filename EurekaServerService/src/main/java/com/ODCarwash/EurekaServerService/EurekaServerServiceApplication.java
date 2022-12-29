package com.ODCarwash.EurekaServerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerServiceApplication.class, args);
	}

}

//@SpringBootApplication : equivalent to enabling these three features
//@EnableAutoConfiguration, @ComponentScan, @Configuration
//enables auto-configuration mechanism
//enables component scan of the package where application is located
//allows to register extra beans, import additional config classes