package org.example;
import java.util.Objects;

public class MilitaryAircraft extends Airplane{
    // data
    Person commander;
    private int numberOfRockets;
    private int maxHeight;

    // constructor
    public MilitaryAircraft(String manufacturer, String model, String name, int yearOfConstruction, int cost, Person commander, int numberOfRockets, int maxHeight) {
        super(manufacturer, model, name, yearOfConstruction, cost);

        if(commander == null)
            throw new IllegalArgumentException("Commander is invalid value");

        if(numberOfRockets < 0)
            throw new IllegalArgumentException("Number of rockets is invalid value");

        if(maxHeight <= 100)
            throw new IllegalArgumentException("Max height is invalid value");

        this.commander = commander;
        this.numberOfRockets = numberOfRockets;
        this.maxHeight = maxHeight;
    }

    // getter
    public Person getCommander() {return commander;}

    public int getNumberOfRockets() {
        return numberOfRockets;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    // setter
    public void setCommander(Person commander) {
        if(commander == null)
            throw new IllegalArgumentException("Commander is invalid value");

        this.commander = commander;
    }

    public void setNumberOfRockets(int numberOfRockets) {
        if(numberOfRockets < 0)
            throw new IllegalArgumentException("Number of rockets is invalid value");

        this.numberOfRockets = numberOfRockets;
    }

    public void setMaxHeight(int maxHeight) {
        if(maxHeight < 100)
            throw new IllegalArgumentException("Max height is invalid value");

        this.maxHeight = maxHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitaryAircraft that = (MilitaryAircraft) o;
        return numberOfRockets == that.numberOfRockets && maxHeight == that.maxHeight && Objects.equals(commander, that.commander);
    }

    @Override
    public String toString() {
        return "\nMilitaryAircraft{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", name='" + getName() + '\'' +
                ", yearOfConstruction=" + getYearOfConstruction() +
                ", cost=" + getCost() +
                ", commander='" + commander + '\'' +
                ", numberOfRockets=" + numberOfRockets +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
