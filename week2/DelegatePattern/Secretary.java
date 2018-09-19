package DelegatePattern;

/**
 * Created by Derrick on 2018-03-23.
 */
public class Secretary implements Work{
    private int salary;
    private String name;

    public Secretary(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getMoney() {
        int moneyStolen = this.salary;
        this.salary = 0;
        return moneyStolen;
    }

    public String toString() {
        return "Secretary: " + name + ", Net Worth: " + salary;
    }
}
