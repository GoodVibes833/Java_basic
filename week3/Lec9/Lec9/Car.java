package Lec9;

public enum Car {
    LAMBORGHINI(500), HONDA(40), FIAT(30);

    private int price;
    Car(int p) {
        this.price = p;
    }

    int getPrice() {
        return this.price;
    }
}
class Client {
    public static void main(String[] args) {
        System.out.println(" === ALL car prices === ");
        Car[] options = Car.values();
        for(Car car: options) {
            System.out.println(car + " is $"+  car.getPrice());
        }
    }
}
