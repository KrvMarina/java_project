package org.example;

public class CargoAircraft extends Airplane{
    // data
    private int capacity;

    // constructor
    public CargoAircraft(String manufacturer, String model, String name, int yearOfConstruction, int cost, int capacity) {
        super(manufacturer, model, name, yearOfConstruction, cost);

        if(capacity < 0)
            throw new IllegalArgumentException("Capacity is invalid value");

        this.capacity = capacity;
    }

    // getter
    public int getCapacity() {
        return capacity;
    }

    // setter
    public void setCapacity(int capacity) {
        if(capacity < 0)
            throw new IllegalArgumentException("Capacity is invalid value");

        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoAircraft that = (CargoAircraft) o;
        return capacity == that.capacity;
    }

    @Override
    public String toString() {
        return "\nCargoAircraft{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", name='" + getName() + '\'' +
                ", yearOfConstruction=" + getYearOfConstruction() +
                ", cost=" + getCost() +
                ", capacity=" + capacity +
                '}';
    }
}
