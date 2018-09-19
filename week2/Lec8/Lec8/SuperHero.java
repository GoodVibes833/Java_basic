package Lec8;

public abstract class SuperHero implements Flyable{
    protected String name;
    protected int power;

    public SuperHero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public abstract void fight();

    public abstract void run();

    public abstract void kill();

    public abstract void alive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
