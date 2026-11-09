package Lab06;

import java.util.Scanner;

class Vehicle {

    protected String vehicleName;

    public Vehicle() {
        vehicleName = "Unknown Vehicle";
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
    }

    // Method Overloading
    public double calculateSpeed() {
        return 0.0;
    }

    public double calculateSpeed(double factor) {
        return calculateSpeed() * factor;
    }
}

// Car Class
class Car extends Vehicle {

    private int engineCapacity;
    private double topSpeed;

    public Car() {
        super();
    }

    public void setCarDetails(String vehicleName,
                              int engineCapacity,
                              double topSpeed) {

        this.vehicleName = vehicleName;
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    @Override
    public void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println("Engine Capacity: "
                + engineCapacity + " CC");

        System.out.println("Top Speed: "
                + calculateSpeed() + " km/h");
    }
}

// Bicycle Class
class Bicycle extends Vehicle {

    private int gearCount;
    private double maxPedalSpeed;

    public Bicycle(String vehicleName, int gearCount,
                   double maxPedalSpeed) {

        super(vehicleName);

        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    @Override
    public void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println("Gear Count: " + gearCount);

        System.out.println("Maximum Pedaling Speed: "
                + calculateSpeed() + " km/h");
    }
}

// Main Class
public class VehicleApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Car Details
        System.out.println("===== ENTER CAR DETAILS =====");

        System.out.print("Enter Vehicle Name: ");
        String carName = input.nextLine();

        System.out.print("Enter Engine Capacity (CC): ");
        int engineCapacity = input.nextInt();

        System.out.print("Enter Top Speed (km/h): ");
        double topSpeed = input.nextDouble();

        Car car = new Car();

        car.setCarDetails(carName, engineCapacity, topSpeed);

        // Bicycle Details
        input.nextLine();

        System.out.println("\n===== ENTER BICYCLE DETAILS =====");

        System.out.print("Enter Bicycle Name: ");
        String bicycleName = input.nextLine();

        System.out.print("Enter Gear Count: ");
        int gearCount = input.nextInt();

        System.out.print("Enter Maximum Pedaling Speed: ");
        double maxPedalSpeed = input.nextDouble();

        Bicycle bicycle = new Bicycle(
                bicycleName,
                gearCount,
                maxPedalSpeed
        );

        // Display Car Details
        System.out.println("\n===== CAR DETAILS =====");

        car.displayVehicleDetails();

        System.out.println("Normal Speed: "
                + car.calculateSpeed() + " km/h");

        System.out.println("Scaled Speed: "
                + car.calculateSpeed(1.5) + " km/h");

        // Display Bicycle Details
        System.out.println("\n===== BICYCLE DETAILS =====");

        bicycle.displayVehicleDetails();

        System.out.println("Normal Speed: "
                + bicycle.calculateSpeed() + " km/h");

        System.out.println("Scaled Speed: "
                + bicycle.calculateSpeed(1.5) + " km/h");

        input.close();
    }
}