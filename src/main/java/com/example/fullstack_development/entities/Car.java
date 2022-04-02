package com.example.fullstack_development.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    private String color;

    private String registerNumber;

    private int year;

    private int price;

//    public Car(String brand, String model, String color, String registerNumber, int year,
//        int price) {
//        super();
//        this.brand = brand;
//        this.model = model;
//        this.color = color;
//        this.registerNumber = registerNumber;
//        this.year = year;
//        this.price = price;
//        System.out.println("I am a constructor : "+ brand);
//    }

    public Car() {
        System.out.println("I am a constructor : ");
    }

    public static void main(String[] args) {
        // Invoke the constructor:
        Car ferrari = new Car(); // Prints: I'm a constructor!
    }
}
