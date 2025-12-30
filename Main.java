// Base class Vehicle
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

// Garage class
class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();  // Polymorphic call
        System.out.println("Vehicle serviced.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        Garage garage = new Garage();

        System.out.println("--- Servicing Car ---");
        garage.serviceVehicle(myCar);

        System.out.println("\n--- Servicing Motorcycle ---");
        garage.serviceVehicle(myMotorcycle);
    }
}
