package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Car;
import com.example.demo.repositories.CarRepository;
import com.example.demo.services.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired CarRepository carRepository;

	@Override
	public Car create(Car car) {
		return carRepository.save(car);
	}

	@Override
	public List<Car> getCars() {
		return carRepository.findAll();
	}

	@Override
	public Car findById(int car_id) {
		return carRepository.findById(car_id).orElse(null);
	}

	@Override
	public List<Car> deleteCarById(int car_id) {
		 carRepository.deleteById(car_id);
		 return carRepository.findAll();
	}
	
}
