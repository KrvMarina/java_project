package org.example;
import java.util.Objects;

public class Airplane {
    // data
    private String manufacturer;
    private String model;
    private String name;
    private int yearOfConstruction;
    private int cost;

    // constructor
    public Airplane(String manufacturer, String model, String name, int yearOfConstruction, int cost) {
        if (manufacturer.length() < 3)
            throw new IllegalArgumentException("Manufacturer is invalid value");

        if (model.length() < 3)
            throw new IllegalArgumentException("Model is invalid value");

        if (name.length() < 3)
            throw new IllegalArgumentException("Name is invalid value");

        if (yearOfConstruction < 1902)
            throw new IllegalArgumentException("Year of construction is invalid value");

        if (cost <= 0)
            throw new IllegalArgumentException("Cost is invalid value");

        this.manufacturer = manufacturer;
        this.model = model;
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    } // getter

    public void setManufacturer(String manufacturer) {
        if (manufacturer.length() < 3)
            throw new IllegalArgumentException("Manufacturer is invalid value");

        this.manufacturer = manufacturer;
    }

    public String getModel() {return model;} // getter

    public void setModel(String model) { // setter
        if (model.length() < 3)
            throw new IllegalArgumentException("Model is invalid value");

        this.model = model;
    }

    public String getName() {
        return name;
    } // getter

    public void setName(String name) { // setter
        if (name.length() < 3)
            throw new IllegalArgumentException("Name is invalid value");

        this.name = name;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    } // getter

    public void setYearOfConstruction(int yearOfConstruction) { // setter
        if (yearOfConstruction < 1902)
            throw new IllegalArgumentException("Year of construction is invalid value");

        this.yearOfConstruction = yearOfConstruction;
    }

    public int getCost() {
        return cost;
    }  // getter

    public void setCost(int cost) { // setter
        if (cost <= 0)
            throw new IllegalArgumentException("Cost is invalid value");

        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return yearOfConstruction == airplane.yearOfConstruction && cost == airplane.cost && Objects.equals(manufacturer, airplane.manufacturer) && Objects.equals(model, airplane.model) && Objects.equals(name, airplane.name);
    }

    @Override
    public String toString() {
        return "\nAirplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", yearOfConstruction=" + yearOfConstruction +
                ", cost=" + cost +
                "}";
    }
}
