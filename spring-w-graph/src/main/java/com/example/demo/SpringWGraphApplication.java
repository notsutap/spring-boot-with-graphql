package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.services.CarService;

@SpringBootApplication
public class SpringWGraphApplication implements CommandLineRunner {

	@Autowired private CarService carService;
	public static void main(String[] args) {
		SpringApplication.run(SpringWGraphApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Car car1 = new Car();
//		car1.setModel("Swift");
//		car1.setType("Coupe");
//		car1.setTransmission("manual");
//		
//		Car car2 = new Car();
//		car2.setModel("Mustang");
//		car2.setType("Muscle");
//		car2.setTransmission("automatic");
//		
//		carService.create(car1);
//		carService.create(car2);
	}

}
