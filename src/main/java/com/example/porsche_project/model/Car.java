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

    @Min(0)
    private Double price;

    @NotBlank
    private String color;

    @Min(0)
    private Integer mileageKm;

    @Length(max = 500)
    private String imageUrl;

    public Car(String model, String trimLevel, Integer year, Double price, String color, Integer mileageKm, String imageUrl) {
        this.model = model;
        this.trimLevel = trimLevel;
        this.year = year;
        this.price = price;
        this.color = color;
        this.mileageKm = mileageKm;
        this.imageUrl = imageUrl;
    }

    public Car() {}

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
}
