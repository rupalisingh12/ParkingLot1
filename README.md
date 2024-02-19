
#  Parking Lot Management System

Welcome to the  Parking Lot Management System! This system provides an automated ticketing solution for managing a parking lot. Users can interact with the system through a command-line interface (CLI) to perform various operations such as parking a car, leaving the parking lot, and querying information about parked cars.

## Installation and Deployment

### Installation

To set up the  Parking Lot Management System, follow these steps:

1. Clone the repository from GitHub:

    ```bash
    git clone <repository_url>
    ```

2. Navigate to the project directory:

    ```bash
    cd <project_directory>
    ```

### Deployment

Deployment of the Parking Lot Management System involves compiling the Java source code into bytecode and packaging it into a JAR (Java Archive) file. Follow these steps to deploy the system:

1. **Compile Java Source Code**: Navigate to the directory containing your Java source files (`*.java`), and compile them using the `javac` command. This will generate the corresponding bytecode (`*.class` files).

    ```bash
    javac *.java
    ```

2. **Create Manifest File (Optional)**: If your Java application has a main class specified, you can create a manifest file (`manifest.txt`) specifying the main class. For example, if your main class is `Main`, create a manifest file with the following content:

    ```
    Main-Class: Main
    ```

3. **Create JAR File**: Use the `jar` command to create a JAR file, specifying the name of the JAR file, the manifest file (if applicable), and the list of files to include in the JAR. If you have a manifest file, include it using the `m` option.

    ```bash
    jar cfm parking_lot.jar manifest.txt *.class
    ```

    If you don't have a manifest file, simply include the list of `.class` files without the `m` option:

    ```bash
    jar cf parking_lot.jar *.class
    ```

4. **Run the JAR File**: Once the JAR file is created, you can run it using the `java` command followed by the name of the JAR file.

    ```bash
    java -jar parking_lot.jar
    ```

    This will execute the main class specified in the manifest file (if provided) or the default main class in the JAR file.

## Usage

After deployment, you can interact with the Parking Lot Management System through the command-line interface. Below are the supported commands and their descriptions (also available in the initial README):

1. **create_parking_lot `<num_slots>`**: Creates a parking lot with the specified number of slots.

   Example:
$ create_parking_lot 6
Created a parking lot with 6 slots

go
Copy code

2. **park `<registration_number>` `<colour>`**: Parks a car in the parking lot and allocates the nearest available slot to it.

Example:
$ park KA-01-HH-1234 White
Allocated slot number: 1

markdown
Copy code

3. **leave `<slot_number>`**: Vacates the specified slot, making it available for parking.

Example:
$ leave 4
Slot number 4 is free

lua
Copy code

4. **status**: Displays the current status of the parking lot, including occupied slots and parked cars.

Example:
$ status
Slot No. Registration No Colour
1 KA-01-HH-1234 White
2 KA-01-HH-9999 White
3 KA-01-BB-0001 Black
5 KA-01-HH-2701 Blue
6 KA-01-HH-3141 Black

javascript
Copy code

5. **registration_numbers_for_cars_with_colour `<colour>`**: Retrieves registration numbers of cars with the specified colour.

Example:
$ registration_numbers_for_cars_with_colour White
KA-01-HH-1234, KA-01-HH-9999

typescript
Copy code

6. **slot_number_for_registration_number `<registration_number>`**: Retrieves the slot number in which a car with the specified registration number is parked.

Example:
$ slot_number_for_registration_number KA-01-HH-1234
Slot number: 1

vbnet
Copy code

7. **slot_numbers_for_cars_with_colour `<colour>`**: Retrieves slot numbers of all slots where a car of the specified colour is parked.

Example:
$ slot_numbers_for_cars_with_colour White
1, 2

perl
Copy code

8. **exit**: Exits the Parking Lot Management System.

