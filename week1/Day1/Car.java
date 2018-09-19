package Cars;

public class Car {
    // states (variables) - color, model, year, price
    String color;
    String model;
    int year;
    double price;

    // constructor - a method to create an instance
    public Car(String c, String m, int y, double p) {
        color = c;
        model = m;
        year = y;
        price = p;
    }

    // behaviors (methods) - drive, park
    public void drive() {
        System.out.println("Drive!!");
    }

    public void park() {
        System.out.println("Park!!");
    }
}
