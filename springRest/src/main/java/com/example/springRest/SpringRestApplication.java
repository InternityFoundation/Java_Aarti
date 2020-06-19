package com.example.springRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}
	
	@Bean
	 public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .paths(PathSelectors.ant("/api/**"))
	                .apis(RequestHandlerSelectors.basePackage("com.example.springRest"))
	                .build()
	                .apiInfo(metaData());
	    }
	 private ApiInfo metaData() {
	        ApiInfo apiInfo = new ApiInfo(
	                "Spring Boot REST CRUD API",
	                "Spring Boot REST API for Course Register",
	                "4.0",
	                "Free to use",
	                new Contact("Aarti Yadav", "https://aartiyadav/about/", "aartiyadav@gmail.com"),
	                "Apache License Version 2.0",
	                "https://www.apache.org/licenses/LICENSE-2.0");
	        return apiInfo;
	    }
}

