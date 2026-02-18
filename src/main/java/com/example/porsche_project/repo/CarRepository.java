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

    // חיפוש לפי ליטרים
    Iterable<Car> findByEngineCc(Integer engineCc);
    Iterable<Car> findByEngineCcGreaterThan(Integer cc);

    //חיפוש לפי כוח סוס
    Iterable<Car> findByHorsePower(Integer horsePower);
    Iterable<Car> findByHorsePowerGreaterThan(Integer hp);

    //חיפוש לפי מושבים
    Iterable<Car> findBySeats(Integer seats);

    //חיפוש לפי מחיר
    Iterable<Car> findByPrice(Double price);
    Iterable<Car> findByPriceLessThan(Double price);
    Iterable<Car> findByPriceBetween(Double min, Double max);

    //חיפוש לפי צבע וגיר
    Iterable<Car> findByColor(String color);
    Iterable<Car> findByTransmission(String transmission);
    Iterable<Car> findByFuelType(String fuelType);

    // חיפוש לפי קילומטרים
    Iterable<Car> findByMileageKmLessThan(Integer km);

    // חיפוש לפי תיאור
    Iterable<Car> findByDescriptionContaining(String text);

    // חיפושים משולבים
    Iterable<Car> findByModelAndYear(String model, Integer year);
    Iterable<Car> findByModelAndTrimLevel(String model, String trimLevel);
    Iterable<Car> findByPriceLessThanAndHorsePowerGreaterThan(Double price, Integer hp);
}
