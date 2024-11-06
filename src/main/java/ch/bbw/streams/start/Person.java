package ch.bbw.streams.start;

import lombok.Data;

@Data
public class Person {

    private static int lastId = 1;

    private int id;
    private String firstname;
    private String lastname;
    private double height;
    private int age;
    private Car car;

    public Person(String firstname, String lastname, double height, int age) {
        this.id = generateId();
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
        this.age = age;
    }

    private static int generateId() { return lastId++; }

}
