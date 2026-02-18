package com.example.porsche_project.dto;

import com.example.porsche_project.model.Car;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class CarIn implements Serializable {

    @NotBlank
    @Length(min = 2, max = 40)
    private String model;

    @NotBlank
    @Length(min = 2, max = 40)
    private String trimLevel;

    @Min(1950)
    @Max(2030)
    private Integer year;

    @Min(1000)
    @Max(10000)
    private Integer engineCc;

    @Min(100)
    @Max(2000)
    private Integer horsePower;

    @Min(2)
    @Max(5)
    private Integer seats;

    @Min(0)
    private Double price;

    @NotBlank
    private String color;

    @NotBlank
    private String transmission;

    @NotBlank
    private String fuelType;

    @Min(0)
    private Integer mileageKm;

    @Length(max = 500)
    private String imageUrl;

    @Length(max = 1000)
    private String description;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrimLevel() {
        return trimLevel;
    }

    public void setTrimLevel(String trimLevel) {
        this.trimLevel = trimLevel;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getEngineCc() {
        return engineCc;
    }

    public void setEngineCc(Integer engineCc) {
        this.engineCc = engineCc;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getMileageKm() {
        return mileageKm;
    }

    public void setMileageKm(Integer mileageKm) {
        this.mileageKm = mileageKm;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Car toCar(CarIn in) {
        return new Car(
                in.getModel(),
                in.getTrimLevel(),
                in.getYear(),
                in.getEngineCc(),
                in.getHorsePower(),
                in.getSeats(),
                in.getPrice(),
                in.getColor(),
                in.getTransmission(),
                in.getFuelType(),
                in.getMileageKm(),
                in.getImageUrl(),
                in.getDescription()
        );
    }



    public void updateCar(Car car) {
        car.setModel(model);
        car.setTrimLevel(trimLevel);
        car.setYear(year);
        car.setEngineCc(engineCc);
        car.setHorsePower(horsePower);
        car.setSeats(seats);
        car.setPrice(price);
        car.setColor(color);
        car.setTransmission(transmission);
        car.setFuelType(fuelType);
        car.setMileageKm(mileageKm);
        car.setImageUrl(imageUrl);
        car.setDescription(description);
    }
}
