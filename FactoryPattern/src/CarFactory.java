// Factory class: Creates different types of cars
public class CarFactory {
    // Factory method to produce a car based on the type
    public static Car createCar(String carType) {
        if (carType == null || carType.isEmpty()) {
            return null;
        }
        switch (carType.toLowerCase()) {
            case "sedan":
                return new SedanCar();
            case "suv":
                return new SuvCar();
            case "hatchback":
                return new HatchbackCar();
            default:
                throw new IllegalArgumentException("Unknown car type: " + carType);
        }
    }
}
