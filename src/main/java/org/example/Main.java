package org.example;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("labs");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Bike bike = new Bike();
        bike.setModel("BMX");

        Car car = new Car();
        car.setModel("BMW");
        car.setSeats(4);
        car.setFuelType("Gasoline");

        Plane plane = new Plane();
        plane.setModel("Boeing 747");
        plane.setPassengerCapacity(1000);
        plane.setFuelType("Gasoline");

        Truck truck = new Truck();
        truck.setModel("Volvo 850");
        truck.setLoadCapacity(10000.0);
        truck.setFuelType("Gasoline");

        em.persist(bike);
        em.persist(car);
        em.persist(plane);
        em.persist(truck);

        em.getTransaction().commit();

        TypedQuery<Vehicle> query = em.createQuery("SELECT v FROM Vehicle AS v", Vehicle.class);
        List<Vehicle> resultList = query.getResultList();

        for (Vehicle vehicle : resultList) {
            System.out.printf("%s - %s - %.2f - %s%n", vehicle.getId(), vehicle.getModel(), vehicle.getPrice(), vehicle.getFuelType());
        }
    }
}