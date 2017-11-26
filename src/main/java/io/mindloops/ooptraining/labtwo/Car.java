package io.mindloops.ooptraining.labtwo;

//import io.mindloops.ooptraining.labtwo.Engine;

public class Car {
    private String serialNumber;
    private int yearOfManufacture;
    private String color;
    private Engine engine;

    public Car(String serialNumber, int yearOfManufacture, String color, Engine engine) {
        this.serialNumber = serialNumber;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.engine = engine;
    }

    public Car() {

    }

    public String getSerialNumber() {

        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {

        this.serialNumber = serialNumber;
    }

    public int getYearOfManufacture() {

        return this.yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {

        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {

        return this.color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public int getHorsepower() {

        return this.engine.getHorsepower();
    }
}
