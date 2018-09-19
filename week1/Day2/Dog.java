package Day2;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public int computePersonAge() {
        return this.age * 7;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
