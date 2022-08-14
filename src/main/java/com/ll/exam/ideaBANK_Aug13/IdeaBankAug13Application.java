package com.ll.exam.ideaBANK_Aug13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class IdeaBankAug13Application {

	public static void main(String[] args) {
		SpringApplication.run(IdeaBankAug13Application.class, args);
	}

}
