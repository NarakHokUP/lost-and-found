package com.kshrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Import({ springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class })
@SpringBootApplication
@ComponentScan({"com.kshrd", "com.phearun.fileupload"})
public class LostAndFoundApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(LostAndFoundApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(LostAndFoundApplication.class);
	}
}
