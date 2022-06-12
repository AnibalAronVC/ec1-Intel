package com.idat;

public class Car {

    public String name;
    public int year;
    public String model;
    public String fillingCapacity;

    public Car(String name, int year, String model, String fillingCapacity) {
        this.name = name;
        this.year = year;
        this.model = model;
        this.fillingCapacity = fillingCapacity;
    }

    @Override
    public String toString() {
        return "Car{" + "with name='" + name + '\'' + ", year=" + year + ", model='" + model + '\'' + ", fillingCapacity='" + fillingCapacity + '\'' + '}';
    }
}
