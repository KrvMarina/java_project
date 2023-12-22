package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Airport {
    String country;
    String city;
    ArrayList<Airplane> airplanes;
    int numberOfParkingSpaces;
    int numberOfCafes;


    public Airport(String country, String city,  ArrayList<Airplane> airplanes, int numberOfParkingSpaces, int numberOfCafes) {
        if (country.length() < 3)
            throw new IllegalArgumentException("country is invalid value");

        if (city.length() < 3)
            throw new IllegalArgumentException("city is invalid value");

        if(airplanes == null)
            throw new IllegalArgumentException("airport is invalid value");

        if (numberOfParkingSpaces < 49)
            throw new IllegalArgumentException("numberOfParkingSpaces is invalid value");

        if (numberOfCafes < 0)
            throw new IllegalArgumentException("numberOfCafes is invalid value");

        this.country = country;
        this.city = city;
        this.airplanes = airplanes;
        this.numberOfParkingSpaces = numberOfParkingSpaces;
        this.numberOfCafes = numberOfCafes;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {return city;}

    public ArrayList<Airplane> getAirplane() {
        return airplanes;
    }

    public int getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    public int getNumberOfCafes() {
        return numberOfCafes;
    }

    public void setCountry(String country) {
        if (country.length() < 3)
            throw new IllegalArgumentException("country is invalid value");

        this.country = country;
    }

    public void setCity(String city) {
        if (city.length() < 3)
            throw new IllegalArgumentException("city is invalid value");

        this.city = city;
    }

    public void setAirplane(ArrayList<Airplane> airplanes) {
        if(airplanes == null)
            throw new IllegalArgumentException("airport is invalid value");

        this.airplanes = airplanes;
    }

    public void setNumberOfParkingSpaces(int numberOfParkingSpaces) {
        if (numberOfParkingSpaces < 49)
            throw new IllegalArgumentException("numberOfParkingSpaces is invalid value");

        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    public void setNumberOfCafes(int numberOfCafes) {
        if (numberOfCafes < 0)
            throw new IllegalArgumentException("numberOfCafes is invalid value");

        this.numberOfCafes = numberOfCafes;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", airplane=" + airplanes +
                ", numberOfParkingSpaces=" + numberOfParkingSpaces +
                ", numberOfCafes=" + numberOfCafes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return numberOfParkingSpaces == airport.numberOfParkingSpaces && numberOfCafes == airport.numberOfCafes && Objects.equals(country, airport.country) && Objects.equals(city, airport.city) && Objects.equals(airplanes, airport.airplanes);
    }

    public ArrayList<Airplane> add(ArrayList<Airplane> airplanes, String model){
        Scanner scanner = new Scanner(System.in);

        // data
        String manufacturer;
        String name;
        int yearOfConstruction;
        int cost;
        int numberOfPassengers;
        String flightTime;
        int numberOfRockets;
        int maxHeight;
        int capacity;
        String surname;
        int age;

        System.out.println("Enter manufacturer: ");
        manufacturer = scanner.next();
        System.out.println("Enter name: ");
        name = scanner.next();
        System.out.println("Enter year of construction: ");
        yearOfConstruction = scanner.nextInt();
        System.out.println("Enter cost: ");
        cost = scanner.nextInt();

        if(model.equals("Passenger")) {
            System.out.println("Enter number of passengers: ");
            numberOfPassengers = scanner.nextInt();
            System.out.println("Enter flight time: ");
            flightTime = scanner.next();
            airplanes.add(new PassengerAircraft(manufacturer, "Passenger", name, yearOfConstruction, cost, numberOfPassengers, flightTime));
        }
        if(model.equals("Cargo")){
            System.out.println("Enter capacity (l): ");
            capacity = scanner.nextInt();
            airplanes.add(new CargoAircraft(manufacturer, "Cargo", name, yearOfConstruction, cost, capacity));
        }
        if(model.equals("Military")){
            System.out.println("Enter surname for commander: ");
            surname = scanner.next();
            System.out.println("Enter age for commander: ");
            age = scanner.nextInt() ;
            System.out.println("Enter number of rockets: ");
            numberOfRockets = scanner.nextInt();
            System.out.println("Enter max height (m): ");
            maxHeight = scanner.nextInt();
            airplanes.add(new MilitaryAircraft(manufacturer, "Military", name, yearOfConstruction, cost, new Person(surname, age), numberOfRockets, maxHeight));
        }
        System.out.println("Done!");
        return airplanes;
    }
    public ArrayList<Airplane> delete(ArrayList<Airplane> airplanes){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of object to delete:");
        airplanes.remove(scanner.nextInt());
        System.out.println("Done!");
        return airplanes;
    }
    public ArrayList<Airplane> print(ArrayList<Airplane> airplane){
        System.out.println(airplane);
        System.out.println("Done!");
        return airplane;
    }
    public void displayAirplaneInfo (ArrayList<PassengerAircraft> airplanesPassenger, ArrayList<CargoAircraft> airplanesCargo, ArrayList<MilitaryAircraft> airplanesMilitary, ArrayList<Person> personArrayList){
        System.out.print("\n---TABLE---\n|--------------------------------------------------------------------------------------------");
        System.out.print("-------------------------------------------------------------------------------------|\n");
        System.out.print("|MANUFACTURER|    MODEL    |    NAME    |YEAR OF CONSTRUCTION|    COST   |NUMBER OF PASSENGERS|FLIGHT TIME");
        System.out.print("|COMMANDER SURNAME|COMMANDER AGE|NUMBER OF ROCKETS| CAPACITY |MAX HEIGHT|");
        System.out.print("\n|--------------------------------------------------------------------------------------------");
        System.out.print("-------------------------------------------------------------------------------------|\n");

        for (int i = 0; i < airplanesPassenger.size(); i++){
            System.out.printf("|%-12s|%-13s|", airplanesPassenger.get(i).getManufacturer(), airplanesPassenger.get(i).getModel());
            System.out.printf("%-12s|%20d|%10d$|", airplanesPassenger.get(i).getName(), airplanesPassenger.get(i).getYearOfConstruction(), airplanesPassenger.get(i).getCost());
            System.out.printf("%20d|%11s|%17s|%13s|%17s|%10s|%10s|", airplanesPassenger.get(i).getNumberOfPassengers(), airplanesPassenger.get(i).getFlightTime(), "-", "-", "-", "-", "-");
            System.out.print("\n|--------------------------------------------------------------------------------------------");
            System.out.print("-------------------------------------------------------------------------------------|\n");
        }
        for (int i = 0; i < airplanesCargo.size(); i++){
            System.out.printf("|%-12s|%-13s|", airplanesCargo.get(i).getManufacturer(), airplanesCargo.get(i).getModel());
            System.out.printf("%-12s|%20d|%10d$|", airplanesCargo.get(i).getName(), airplanesCargo.get(i).getYearOfConstruction(), airplanesCargo.get(i).getCost());
            System.out.printf("%20s|%11s|%17s|%13s|%17s|%10s|%10d|", "-", "-", "-", "-", "-", "-", airplanesCargo.get(i).getCapacity());
            System.out.print("\n|--------------------------------------------------------------------------------------------");
            System.out.print("-------------------------------------------------------------------------------------|\n");
        }
        for (int i = 0; i < airplanesCargo.size(); i++){
            System.out.printf("|%-12s|%-13s|", airplanesMilitary.get(i).getManufacturer(), airplanesMilitary.get(i).getModel());
            System.out.printf("%-12s|%20d|%10d$|", airplanesMilitary.get(i).getName(), airplanesMilitary.get(i).getYearOfConstruction(), airplanesMilitary.get(i).getCost());
            System.out.printf("%20s|%11s|%-17s|%13d|%17d|%10d|%10s|", "-", "-", personArrayList.get(i).getSurname(), personArrayList.get(i).getAge(), airplanesMilitary.get(i).getNumberOfRockets(), airplanesMilitary.get(i).getMaxHeight(), "-");
            System.out.print("\n|--------------------------------------------------------------------------------------------");
            System.out.print("-------------------------------------------------------------------------------------|\n");
        }
        System.out.println("Done!");
    }
}
