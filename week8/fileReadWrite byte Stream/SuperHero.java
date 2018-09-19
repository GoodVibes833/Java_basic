package Chapter15;

import java.io.Serializable;

public class SuperHero implements Serializable {

    private int id;
    private String name;
    private int age;
    private String superpower;

    public SuperHero(int id, String name, int age, String superpower) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.superpower = superpower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" + "NAME: " + name + "\n"
                + "AGE: " + age + "\n" + "SUPERPOWER: " + superpower + "\n";
    }
}
