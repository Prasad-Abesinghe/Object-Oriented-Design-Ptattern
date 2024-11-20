public class Main {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        sedanFactory.testDrive(); // Output: Driving a sedan.

        CarFactory suvFactory = new SUVFactory();
        suvFactory.testDrive(); // Output: Driving an SUV.
    }
}