// Main class to demonstrate the Factory Method Pattern
public class Main {
    public static void main(String[] args) {
        // Create a Sedan car using the factory
        Car sedan = CarFactory.createCar("sedan");
        System.out.println("Sedan Car -> " + sedan.getSpecifications());

        // Create an SUV car using the factory
        Car suv = CarFactory.createCar("suv");
        System.out.println("SUV Car -> " + suv.getSpecifications());

        // Create a Hatchback car using the factory
        Car hatchback = CarFactory.createCar("hatchback");
        System.out.println("Hatchback Car -> " + hatchback.getSpecifications());

        // Attempt to create an unknown car type (throws exception)
        try {
            Car unknown = CarFactory.createCar("truck");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
