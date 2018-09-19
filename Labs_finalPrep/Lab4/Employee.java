package PairProgramming;

public abstract class Employee implements Employable, Comparable {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double getOverTimePayRate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
