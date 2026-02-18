package com.example.porsche_project.model;

import org.hibernate.validator.constraints.Length;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "porsche_cars")
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Length(min = 2, max = 40)
    private String model;

    @NotBlank
    @Length(min = 2, max = 40)
    private String trimLevel;

    @Min(1948)
    @Max(2026)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Car() {}
    public Car(String model, String trimLevel, Integer year, Integer engineCc, Integer horsePower,
               Integer seats, Double price, String color, String transmission, String fuelType,
               Integer mileageKm, String imageUrl, String description) {
        this.model = model;
        this.trimLevel = trimLevel;
        this.year = year;
        this.engineCc = engineCc;
        this.horsePower = horsePower;
        this.seats = seats;
        this.price = price;
        this.color = color;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.mileageKm = mileageKm;
        this.imageUrl = imageUrl;
        this.description = description;
    }

}
