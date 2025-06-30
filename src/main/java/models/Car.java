package models;

import jakarta.persistence.*;

@Entity
public class Car extends Vehicle{
    @Column(name = "seats")
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
