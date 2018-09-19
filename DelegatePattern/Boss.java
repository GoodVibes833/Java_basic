package DelegatePattern;

/**
 * Created by Derrick on 2018-03-23.
 */

public class Boss {
    private int networth;
    private String name;
    private Work secretWorker;

    public Boss(String name, int networth, Work secretWorker) {
        this.name = name;
        this.networth = networth;
        this.secretWorker = secretWorker;
    }

    public void stealMoney() {
        this.networth += secretWorker.getMoney();
    }

    @Override
    public String toString() {
        return "Boss: " + name + ", Net Worth: " + networth;
    }
}


