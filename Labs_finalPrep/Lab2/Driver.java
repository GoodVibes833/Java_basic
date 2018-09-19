package Lab2;

/**
 * Created by Derrick on 2018-03-22.
 */
public class Driver {

    public static void main(String[] args) {

        Country ca = new Country();
        ca.displayAllProvinces();
        int c = ca.howManyHaveThisPopulation(5, 15);
        System.out.println(c);
    }
}
