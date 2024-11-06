package ch.bbw.streams.start;

import lombok.Data;

@Data
public class Car {

    private static int lastId = 1;

    private int id;
    private String brand;
    private String model;
    private String color;
    private int ps;

    public Car(String brand, String model, String color, int ps) {
        this.id = generateId();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ps = ps;
    }
    private static int generateId() { return lastId++; }

}
