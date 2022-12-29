package com.ODCarwash.AdminBlock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableSwagger2
@EnableEurekaClient
public class AdminBlockApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminBlockApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	    return builder.build();
	}

}

//@Springbootapplication is used to mark a configuration class that declares one or more @bean methods and also 
//triggers auto-configuration and component scanning
//@Bean is applied on a method to specify that it returns a bean to be managed by spring context
