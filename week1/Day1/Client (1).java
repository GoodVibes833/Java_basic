import Cars.Car;

public class Client {
    // Class you can run your code!
    public static void main(String[] args) {
        Car myCar = new Car("Blue", "BMW", 2018, 70_000.0);
        Car yourCar = new Car("Red", "Lamborghini", 2018, 400_000.0);
        myCar.drive();
        yourCar.park();

    }
}
