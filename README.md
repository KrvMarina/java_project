**About Program:**

I created an Airplane class with the following attributes: manufacturer, model, name, yearOfConstruction, cost, and appropriate methods (constructor, getters and setters, toString). In the constructor and setters, I check the value of the arguments for correctness. The input.txt file contains information about the aircraft in this order, each part on a separate line: manufacturer, model, name, year of manufacture, cost. Information between planes is separated by a blank line. The correctness of the information in the file is not guaranteed. I wrote a program that reads information about planes from the input.txt file, creates an object of the appropriate type for each of the planes, and adds this object to an array or ArrayList. 

I also inherited three new classes, namely PassengerAircraft, MilitaryAircraft, and CargoAircraft (cargo plane), from the Airplane class. The PassengerAircraft class has the following additional attributes: numberOfPassengers (number of passengers) and flightTime (timeflight). The MilitaryAircraft class has the following additional attributes: commander, numberOfRockets, maxHeight (maximum height). The CargoAircraft class has the following additional attributes: capacity. These new classes have proper methods (constructor, getters and setters, equals, toString) with proper checking in the constructor and setters. The program prompts the user for information about airplanes. When all information is entered, the program calls the displayAirplaneInfo method, which displays information about airplanes on the screen in the form of a table.

The MilitaryAircraft class now has the commander attribute, where the commander is an object of the Person type. I created a Person class with attributes as desired and proper methods. The inputCommanders.txt file contains information about the commanders, each part on a separate line, and information between commanders is separated by an empty line. The correctness of the information in the file is not guaranteed. The inputAirplanes.txt file contains information about the airplanes, each part on a separate line, and information between planes is separated by a blank line.

Additionally, I created an Airport class with appropriate attributes, where one of the attributes is airplanes. The class has proper methods (constructor, getters and setters, equals, toString) with proper validation in constructor and setters. The program reads information about commanders and planes from files. Next, the program works in the form of a menu and offers the following options: - add a new plane - delete a plane - display information about the plane on the screen - display information about the planes on the screen in the form of a table - complete the execution. To execute the menu options, the Airport class has appropriate methods.

------------------------------

**Program Output:**
![image](https://github.com/KrvMarina/java_project/assets/142495792/f463849b-9578-4c23-93b7-2501b861a88f)

![image](https://github.com/KrvMarina/java_project/assets/142495792/eb285896-c479-4881-b9fb-4e1953a74b45)

![image](https://github.com/KrvMarina/java_project/assets/142495792/b28fab29-64f8-4f79-a828-fb58e48eebaa)

