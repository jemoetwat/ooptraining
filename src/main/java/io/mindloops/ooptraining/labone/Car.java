package io.mindloops.ooptraining.labone;

public class Car {
    String serialNumber;
    int yearOfManufacture;
    String color;
    Engine engine;

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

    public Engine getEngine() {

        return engine;
    }

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public int getHorsepower() {
        return this.getEngine().getHorsepower();
    }
}
