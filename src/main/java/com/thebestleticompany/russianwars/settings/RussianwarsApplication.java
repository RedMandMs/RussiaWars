package com.thebestleticompany.russianwars.settings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.thebestleticompany.russianwars")
public class RussianwarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RussianwarsApplication.class, args);
	}
}
