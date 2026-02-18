package com.example.porsche_project.controller;

import com.example.porsche_project.dto.CarIn;
import com.example.porsche_project.model.Car;
import com.example.porsche_project.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllCars() {
        return new ResponseEntity<>(carService.all(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneCar(@PathVariable Long id) {
        return new ResponseEntity<>(carService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> insertCar(@RequestBody CarIn carIn) {
        Car car = carIn.toCar(carIn);
        car = carService.save(car);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCar(@PathVariable Long id, @RequestBody CarIn carIn) {
        Optional<Car> dbCar = carService.findById(id);
        carIn.updateCar(dbCar.get());
        Car updatedCar = carService.save(dbCar.get());
        return new ResponseEntity<>(updatedCar, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable Long id) {
        Optional<Car> dbCar = carService.findById(id);
        carService.delete(dbCar.get());
        return new ResponseEntity<>("DELETED", HttpStatus.OK);
    }

    @GetMapping("/by-model/{model}")
    public ResponseEntity<?> byModel(@PathVariable String model) {
        return new ResponseEntity<>(carService.findByModel(model), HttpStatus.OK);
    }

    @GetMapping("/by-trim/{trim}")
    public ResponseEntity<?> byTrim(@PathVariable String trim) {
        return new ResponseEntity<>(carService.findByTrimLevel(trim), HttpStatus.OK);
    }

    // -------- year --------

    @GetMapping("/by-year/{year}")
    public ResponseEntity<?> byYear(@PathVariable Integer year) {
        return new ResponseEntity<>(carService.findByYear(year), HttpStatus.OK);
    }

    @GetMapping("/by-year-between")
    public ResponseEntity<?> byYearBetween(@RequestParam Integer min,
                                           @RequestParam Integer max) {
        return new ResponseEntity<>(carService.findByYearBetween(min, max), HttpStatus.OK);
    }

    // -------- engineCc --------

    @GetMapping("/by-engine/{cc}")
    public ResponseEntity<?> byEngine(@PathVariable Integer cc) {
        return new ResponseEntity<>(carService.findByEngineCc(cc), HttpStatus.OK);
    }

    @GetMapping("/by-engine-gt/{cc}")
    public ResponseEntity<?> byEngineGt(@PathVariable Integer cc) {
        return new ResponseEntity<>(carService.findByEngineCcGreaterThan(cc), HttpStatus.OK);
    }

    // -------- horsePower --------

    @GetMapping("/by-hp/{hp}")
    public ResponseEntity<?> byHp(@PathVariable Integer hp) {
        return new ResponseEntity<>(carService.findByHorsePower(hp), HttpStatus.OK);
    }

    @GetMapping("/by-hp-gt/{hp}")
    public ResponseEntity<?> byHpGt(@PathVariable Integer hp) {
        return new ResponseEntity<>(carService.findByHorsePowerGreaterThan(hp), HttpStatus.OK);
    }

    // -------- seats --------

    @GetMapping("/by-seats/{seats}")
    public ResponseEntity<?> bySeats(@PathVariable Integer seats) {
        return new ResponseEntity<>(carService.findBySeats(seats), HttpStatus.OK);
    }

    // -------- price --------

    @GetMapping("/by-price/{price}")
    public ResponseEntity<?> byPrice(@PathVariable Double price) {
        return new ResponseEntity<>(carService.findByPrice(price), HttpStatus.OK);
    }

    @GetMapping("/by-price-lt/{price}")
    public ResponseEntity<?> byPriceLt(@PathVariable Double price) {
        return new ResponseEntity<>(carService.findByPriceLessThan(price), HttpStatus.OK);
    }

    @GetMapping("/by-price-between")
    public ResponseEntity<?> byPriceBetween(@RequestParam Double min,
                                            @RequestParam Double max) {
        return new ResponseEntity<>(carService.findByPriceBetween(min, max), HttpStatus.OK);
    }

    // -------- color / transmission / fuel --------

    @GetMapping("/by-color/{color}")
    public ResponseEntity<?> byColor(@PathVariable String color) {
        return new ResponseEntity<>(carService.findByColor(color), HttpStatus.OK);
    }

    @GetMapping("/by-transmission/{t}")
    public ResponseEntity<?> byTransmission(@PathVariable String t) {
        return new ResponseEntity<>(carService.findByTransmission(t), HttpStatus.OK);
    }

    @GetMapping("/by-fuel/{fuel}")
    public ResponseEntity<?> byFuel(@PathVariable String fuel) {
        return new ResponseEntity<>(carService.findByFuelType(fuel), HttpStatus.OK);
    }

    // -------- mileage --------

    @GetMapping("/by-mileage-lt/{km}")
    public ResponseEntity<?> byMileageLt(@PathVariable Integer km) {
        return new ResponseEntity<>(carService.findByMileageKmLessThan(km), HttpStatus.OK);
    }

    // -------- description --------

    @GetMapping("/by-description")
    public ResponseEntity<?> byDescription(@RequestParam String text) {
        return new ResponseEntity<>(carService.findByDescriptionContaining(text), HttpStatus.OK);
    }

    // -------- combined --------

    @GetMapping("/by-model-year")
    public ResponseEntity<?> byModelYear(@RequestParam String model,
                                         @RequestParam Integer year) {
        return new ResponseEntity<>(carService.findByModelAndYear(model, year), HttpStatus.OK);
    }

    @GetMapping("/by-model-trim")
    public ResponseEntity<?> byModelTrim(@RequestParam String model,
                                         @RequestParam String trim) {
        return new ResponseEntity<>(carService.findByModelAndTrimLevel(model, trim), HttpStatus.OK);
    }

    @GetMapping("/by-price-hp")
    public ResponseEntity<?> byPriceHp(@RequestParam Double price,
                                       @RequestParam Integer hp) {
        return new ResponseEntity<>(
                carService.findByPriceLessThanAndHorsePowerGreaterThan(price, hp),
                HttpStatus.OK
        );
    }
}