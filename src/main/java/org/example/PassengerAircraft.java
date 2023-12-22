package org.example;
import java.util.Objects;

public class PassengerAircraft extends Airplane {
    // data
    private int numberOfPassengers;
    private String flightTime;

    // constructor
    public PassengerAircraft(String manufacturer, String model, String name, int yearOfConstruction, int cost, int numberOfPassengers, String flightTime) {
        super(manufacturer, model, name, yearOfConstruction, cost);

        if(numberOfPassengers < 1)
            throw new IllegalArgumentException("Number of passengers is invalid value");

        if(flightTime.length() < 4)
            throw new IllegalArgumentException("Flight time of passengers is invalid value");

        this.numberOfPassengers = numberOfPassengers;
        this.flightTime = flightTime;
    }

    // getter
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getFlightTime() {
        return flightTime;
    }

    // setter
    public void setNumberOfPassengers(int numberOfPassengers) {
        if(numberOfPassengers < 1)
            throw new IllegalArgumentException("Number of passengers is invalid value");
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setFlightTime(String flightTime) {
        if(flightTime.length() < 4)
            throw new IllegalArgumentException("Flight time of passengers is invalid value");
        this.flightTime = flightTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerAircraft that = (PassengerAircraft) o;
        return numberOfPassengers == that.numberOfPassengers && Objects.equals(flightTime, that.flightTime);
    }

    @Override
    public String toString() {
        return "\nPassengerAircraft{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", name='" + getName() + '\'' +
                ", yearOfConstruction=" + getYearOfConstruction() +
                ", cost=" + getCost() +
                ", numberOfPassengers=" + numberOfPassengers +
                ", flightTime='" + flightTime + '\'' +
                '}';
    }
}
