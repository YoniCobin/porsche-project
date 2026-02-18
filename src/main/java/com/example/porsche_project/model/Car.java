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
