package com.lala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.lala")
@EnableJpaRepositories("com.lala.persistence.repo")
@EntityScan("com.lala.persistence.model")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
