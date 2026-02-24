package com.example.porsche_project.repo;

import com.example.porsche_project.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
    // חיפוש לפי דגם
    Iterable<Car> findByModel(String model);
    Iterable<Car> findByTrimLevel(String trimLevel);

    //חיפוש לפי שנים
    Iterable<Car> findByYear(Integer year);
    Iterable<Car> findByYearBetween(Integer min, Integer max);

    //חיפוש לפי מחיר
    Iterable<Car> findByPrice(Double price);
    Iterable<Car> findByPriceLessThan(Double price);
    Iterable<Car> findByPriceBetween(Double min, Double max);

    //חיפוש לפי צבע וגיר
    Iterable<Car> findByColor(String color);
    // חיפוש לפי קילומטרים
    Iterable<Car> findByMileageKmLessThan(Integer km);

    // חיפושים משולבים
    Iterable<Car> findByModelAndYear(String model, Integer year);
    Iterable<Car> findByModelAndTrimLevel(String model, String trimLevel);
}
