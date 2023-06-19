package com.jetbreed.CRUDWebService;

import com.jetbreed.CRUDWebService.entity.StudentEntity;
import com.jetbreed.CRUDWebService.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableAutoConfiguration
//@ComponentScan(basePackages = { "com.jetbreed.CRUDWebService.*, controller, entity, model, repository, services" })
//@EntityScan(basePackages = { "com.jetbreed.CRUDWebService.*, controller, entity, model, repository, services" })
//@EnableJpaRepositories(basePackages = { "com.jetbreed.CRUDWebService.*, controller, entity, model, repository, services" })
@SpringBootApplication
public class CrudWebServiceApplication {

	@Bean
	Student student(){
		return new Student();
	}

	@Bean
	StudentEntity studentEntity(){
		return new StudentEntity();
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudWebServiceApplication.class, args);
	}

}



