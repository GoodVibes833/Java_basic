package Day2;

public class Kennel {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Milo", 1);
        Dog dog2 = new Dog("Apple", 12);
        System.out.println(dog1.computePersonAge());
        System.out.println(dog2.computePersonAge());
    }
}
