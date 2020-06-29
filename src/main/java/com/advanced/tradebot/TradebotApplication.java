package com.advanced.tradebot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TradebotApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradebotApplication.class, args);
	}

}
