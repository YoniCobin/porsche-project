package com.example.porsche_project.service;

import com.example.porsche_project.model.Car;
import com.example.porsche_project.repo.CarRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public Iterable<Car> all() {
        return repository.findAll();
    }

    public Optional<Car> findById(Long id) {
        return repository.findById(id);
    }

    public Car save(Car car) {
        return repository.save(car)
    }

    public void delete(Car car) {
        repository.delete(car);
    }

    public Iterable<Car> findByModel(String model) {
        return repository.findByModel(model);
    }

    public Iterable<Car> findByTrimLevel(String trimLevel) {
        return repository.findByTrimLevel(trimLevel);
    }

    public Iterable<Car> findByYear(Integer year) {
        return repository.findByYear(year);
    }

    public Iterable<Car> findByYearBetween(Integer min, Integer max) {
        return repository.findByYearBetween(min, max);
    }

    public Iterable<Car> findByPrice(Double price) {
        return repository.findByPrice(price);
    }

    public Iterable<Car> findByPriceLessThan(Double price) {
        return repository.findByPriceLessThan(price);
    }

    public Iterable<Car> findByPriceBetween(Double min, Double max) {
        return repository.findByPriceBetween(min, max);
    }

    public Iterable<Car> findByColor(String color) {
        return repository.findByColor(color);
    }

    public Iterable<Car> findByMileageKmLessThan(Integer km) {
        return repository.findByMileageKmLessThan(km);
    }

    public Iterable<Car> findByModelAndYear(String model, Integer year) {
        return repository.findByModelAndYear(model, year);
    }

    public Iterable<Car> findByModelAndTrimLevel(String model, String trimLevel) {
        return repository.findByModelAndTrimLevel(model, trimLevel);
    }
}