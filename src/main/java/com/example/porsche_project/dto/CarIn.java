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


    @Min(0)
    private Double price;

    @NotBlank
    private String color;

    @Min(0)
    private Integer mileageKm;

    @Length(max = 500)
    private String imageUrl;

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

    public Car toCar(CarIn in) {
        return new Car(
                in.getModel(),
                in.getTrimLevel(),
                in.getYear(),
                in.getPrice(),
                in.getColor(),
                in.getMileageKm(),
                in.getImageUrl()
        );
    }



    public void updateCar(Car car) {
        car.setModel(model);
        car.setTrimLevel(trimLevel);
        car.setYear(year);
        car.setPrice(price);
        car.setColor(color);
        car.setMileageKm(mileageKm);
        car.setImageUrl(imageUrl);
    }
}
