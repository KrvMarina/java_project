package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // data
        String manufacturer;
        String model;
        String name;
        int yearOfConstruction;
        int cost;
        int numberOfPassengers;
        String flightTime;
        int capacity;
        String surname=null;
        int age=0;
        int numberOfRockets;
        int maxHeight;

        // files
        File myFileCommander = new File("inputСommanders.txt");
        Scanner fileCommander = new Scanner(myFileCommander);

        File myFileAirplane = new File("inputAirplanes.txt");
        Scanner fileAirplane = new Scanner(myFileAirplane);

        FileWriter allActions = new FileWriter("allActions.txt");

        // ArrayLists
        ArrayList<Airplane> airplaneArrayList = new ArrayList<>();
        ArrayList<Airplane> passengerAircraftArrayList = new ArrayList<>();
        ArrayList<Airplane> cargoAircraftArrayList = new ArrayList<>();
        ArrayList<Airplane> militaryAircraftArrayList = new ArrayList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();

        // ArrayList for Display table
        ArrayList<PassengerAircraft> passengerAircraftArrayList1 = new ArrayList<>();
        ArrayList<CargoAircraft> cargoAircraftArrayList1 = new ArrayList<>();
        ArrayList<MilitaryAircraft> militaryAircraftArrayList1 = new ArrayList<>();

        // data about airport
        Airport airport = new Airport("China", "Beijing", airplaneArrayList, 100, 4);

        // read data from a file
        while (fileAirplane.hasNext()) {
            manufacturer = fileAirplane.next();
            model = fileAirplane.next();
            name = fileAirplane.next();
            yearOfConstruction = fileAirplane.nextInt();
            cost = fileAirplane.nextInt();
            airplaneArrayList.add(new Airplane(manufacturer, model, name, yearOfConstruction, cost));

            if (model.equals("Passenger")) {
                numberOfPassengers = fileAirplane.nextInt();
                flightTime = fileAirplane.next();
                passengerAircraftArrayList.add(new PassengerAircraft(manufacturer, model, name, yearOfConstruction, cost, numberOfPassengers, flightTime));
                passengerAircraftArrayList1.add(new PassengerAircraft(manufacturer, model, name, yearOfConstruction, cost, numberOfPassengers, flightTime));
            }

            if(model.equals("Cargo")){
                capacity = fileAirplane.nextInt();
                cargoAircraftArrayList.add(new CargoAircraft(manufacturer, model, name, yearOfConstruction, cost, capacity));
                cargoAircraftArrayList1.add(new CargoAircraft(manufacturer, model, name, yearOfConstruction, cost, capacity));
            }
            if(model.equals("Military")){
                while (fileCommander.hasNext()) {
                    surname = fileCommander.next();
                    age = fileCommander.nextInt();
                    personArrayList.add(new Person(surname, age));
                    break;
                }
                numberOfRockets = fileAirplane.nextInt();
                maxHeight = fileAirplane.nextInt();
                militaryAircraftArrayList.add(new MilitaryAircraft(manufacturer, model, name, yearOfConstruction, cost, new Person(surname, age), numberOfRockets, maxHeight));
                militaryAircraftArrayList1.add(new MilitaryAircraft(manufacturer, model, name, yearOfConstruction, cost, new Person(surname, age), numberOfRockets, maxHeight));
            }
        }

        // close files
        fileAirplane.close();
        fileCommander.close();

        Scanner scanner = new Scanner(System.in);

        // menu
        System.out.println("Hello!\nChoose action!");
        System.out.println("1 - Add a new aircraft");
        System.out.println("2 - Delete aircraft");
        System.out.println("3 - Display all aircraft");
        System.out.println("4 - Display aircraft in the form of tables");
        System.out.println("5 - complete execution");
        System.out.println("--------\nEnter only 1 to 5:");

        int variant;
        variant = scanner.nextInt();
        do{
            switch (variant){
                case 1:
                    System.out.println("Enter the model (Passenger/Cargo/Military) of aircraft you want to add");
                    model = scanner.next();
                    if (model.equals("Passenger"))
                        airport.add(passengerAircraftArrayList, model);
                    if (model.equals("Cargo"))
                        airport.add(cargoAircraftArrayList, model);
                    if (model.equals("Military"))
                        airport.add(militaryAircraftArrayList, model);
                    allActions.write("User added aircraft.");
                    break;
                case 2:
                    System.out.println("Enter the model (Passenger/Cargo/Military) of aircraft you want to delete");
                    model = scanner.next();
                    if (model.equals("Passenger"))
                        airport.delete(passengerAircraftArrayList);
                    if (model.equals("Cargo"))
                        airport.delete(cargoAircraftArrayList);
                    if (model.equals("Military"))
                        airport.delete(militaryAircraftArrayList);
                    allActions.write("User deleted aircraft.");
                    break;
                case 3:
                    airport.print(passengerAircraftArrayList);
                    airport.print(cargoAircraftArrayList);
                    airport.print(militaryAircraftArrayList);
                    allActions.write("User printed aircraft");
                    break;
                case 4:
                    airport.displayAirplaneInfo(passengerAircraftArrayList1, cargoAircraftArrayList1, militaryAircraftArrayList1, personArrayList);
                    allActions.write("User printed in the form of tables aircraft");
                    break;
                case 5:
                    System. exit(0);
                    allActions.write("User completed execution");
                default:
                    System.out.println("Choose only 1 to 5!");
                    allActions.write("User entered an option that does not exist");
            }
            System.out.println("--------\nEnter only 1 to 5:");
            variant = scanner.nextInt();
        } while (variant != 0) ;
        allActions.close();
    }
}