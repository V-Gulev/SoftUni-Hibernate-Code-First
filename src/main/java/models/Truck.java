package models;


import jakarta.persistence.*;

@Entity
public class Truck extends Vehicle{
    @Column(name = "load_capacity")
    private Double loadCapacity;


    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
