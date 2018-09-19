package Lec9;

public abstract class SuperHero implements Flyable {
    private String name;
    private int age;

    public SuperHero(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void fight();

    public void run() {
        System.out.println(name + " is running...");
    }
}
