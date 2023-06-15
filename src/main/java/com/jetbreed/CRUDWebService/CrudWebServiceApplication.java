package com.jetbreed.CRUDWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableAutoConfiguration
//@ComponentScan(basePackages = { "com.jetbreed.CRUDWebService.*, controller, entity, model, repository, services" })
//@EntityScan(basePackages = { "com.jetbreed.CRUDWebService.*, controller, entity, model, repository, services" })
//@EnableJpaRepositories(basePackages = { "com.jetbreed.CRUDWebService.*, controller, entity, model, repository, services" })
@SpringBootApplication
public class CrudWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudWebServiceApplication.class, args);
	}

}



