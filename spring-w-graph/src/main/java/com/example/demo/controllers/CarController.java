package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.entities.Car;
import com.example.demo.services.CarService;

@Controller
public class CarController {
	
	@Autowired private CarService carService;
	
	@MutationMapping("createCar")
	public Car create(@Argument CarInput car) {
		Car c = new Car();
		c.setModel(car.getModel());
		c.setTransmission(car.getTransmission());
		c.setType(car.getType());
		return carService.create(c);
	}
	
	@QueryMapping("getAllCars")
	public List<Car> getCars() {
		return carService.getCars();
	}
	
	@QueryMapping("getCarById")
	public Car getCarById(@Argument int car_id) {
		return carService.findById(car_id);
	}
	
	@MutationMapping("deleteCarById")
	public List<Car> deleteCarById(@Argument int car_id) {
		return carService.deleteCarById(car_id);
	}
}

class CarInput {
	
	private String model;
	
	private String transmission;
	
	private String type;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}