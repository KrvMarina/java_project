Create Airplane class with the following attributes - manufacturer, model, name, yearOfConstruction, cost - and appropriate methods (constructor, getters and setters, toString). In the constructor and setters, check the value of the arguments for correctness.The input.txt file contains information about the aircraft in this order, each part on a separate line - manufacturer, model, name, year of manufacture, cost. Information between planes is separated by a blank line. The correctness of the information in the file is not guaranteed.Write a program that reads information about planes from the input.txt file, creating an object of the appropriate type for each of the planes and adding this object to an array or ArrayList. If all the information in the file is correct, display the information about the aircraft on the screen in the form of a table.

Convert the Airplane class from past Exercise 3 to an abstract class.
Inherit three new classes PassengerAircraft, MilitaryAircraft and CargoAircraft (cargo plane) from the Airplane class.
The PassengerAircraft class has the following additional attributes - numberOfPassengers (number of passengers) and flightTime (timeflight).
The MilitaryAircraft class has the following additional attributes: commander, numberOfRockets, maxHeight (maximum height).
The CargoAircraft class has the following additional attributes - capacity.
New classes must have proper methods (constructor, getters and setters, equals, toString) with proper checking in the constructor and setters.
Write a program that prompts the user for information about airplanes. When all information is entered, the program calls the displayAirplaneInfo method, which displays information about airplanes on the screen in the form of a table.


Take as a basis the class hierarchy from the previous exercise 4. 
The MilitaryAircraft class has the commander attribute. The commander is an object of the Person type. Create a Person class, attributes as you wish. Proper methods must be present. 
The inputCommanders.txt file contains information about the commanders, each part on a separate line. Information between commanders is separated by an empty line. The correctness of the information in the file is not guaranteed. 
The inputAirplanes.txt file contains information about the airplanes, each part on a separate line. Information between planes is separated by a blank line. The correctness of the information in the file is not guaranteed. 
Create an Airport class, add appropriate attributes (minimum 5). One of the attributes is airplanes. Add proper methods (constructor, getters and setters, equals, toString) with proper validation in constructor and setters. 
Write a program that reads information about commanders and planes from files. Next, the program works in the form of a menu and offers the following options: - add a new plane - delete a plane - display information about the plane on the screen - display information about the planes on the screen in the form of a table - complete the execution 
To execute the menu options, the Airport class must have appropriate methods. Changed aircraft information must be written to the appropriate file at the end of the program execution.
