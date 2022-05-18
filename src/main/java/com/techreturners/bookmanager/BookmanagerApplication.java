package com.techreturners.bookmanager;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmanagerApplication.class, args);
	}

	/* You are using the builder pattern here to construct the GroupedOpenApi instance.
		It is a way of choosing how to build (construct) the GroupedOpenApi object by specifying
		some construction steps.
		The Special Builder object helps with the process of constructing.
	 */
	@Bean
	public GroupedOpenApi swaggerConfiguration(){
		return GroupedOpenApi.builder()
				.group("book-manager-api")
				.pathsToMatch("/api/v1/book/**")
				.build();
	}





}
