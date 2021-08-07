package com.jel.prideDevBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan({"com.jel.prideDevBank"})
@EntityScan({"com.jel.prideDevBank.entity"})
@EnableAutoConfiguration
@EnableJpaRepositories("com.jel.prideDevBank.repository")

@SpringBootApplication
public class PrideDevBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrideDevBankApplication.class, args);
	}

}
