package com.example.fullstack_development.plant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="PLANTS")
public class Plant{
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "WATERING_FREQUENCY")
    private Integer wateringFrequency;
    @Column(name = "HAS_FRUIT")
    private Boolean hasFruit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getWateringFrequency() {
        return wateringFrequency;
    }

    public void setWateringFrequency(Integer wateringFrequency) {
        this.wateringFrequency = wateringFrequency;
    }

    public Boolean getHasFruit() {
        return hasFruit;
    }

    public void setHasFruit(Boolean hasFruit) {
        this.hasFruit = hasFruit;
    }
}
