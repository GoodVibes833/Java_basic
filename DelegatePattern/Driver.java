package DelegatePattern;

/**
 * Created by Derrick on 2018-03-23.
 */
public class Driver {

    public static void main(String[] args) {
        Secretary amanda = new Secretary("Amanda" , 6000);
        Boss derrick = new Boss("Derrick", 10000000, amanda);
        System.out.println(derrick);
        System.out.println(amanda);

        System.out.println("Amanda is sleeping...");
        System.out.println("Let's steal her money.");
        derrick.stealMoney();

        System.out.println(derrick);
        System.out.println(amanda);

    }
}
