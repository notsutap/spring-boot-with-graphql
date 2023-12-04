package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Car;

public interface CarService {

	Car create(Car car);

	List<Car> getCars();

	Car findById(int car_id);

	List<Car> deleteCarById(int car_id);

	
}
