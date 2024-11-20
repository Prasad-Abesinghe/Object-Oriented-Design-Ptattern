public abstract class CarFactory{
    public abstract Car createCar();

    public void testDrive(){
        Car car = createCar();
        car.drive();
    }
}
