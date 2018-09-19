package Lab1;

import java.util.Scanner;

/**
 * @author Derrick on 2018-03-16.
 */
public class DataTypeExercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1
        String fahr = scan.nextLine();
        String result1 = fahrenheitToCelsius(Integer.valueOf(fahr));
        System.out.println(result1);

        // 2
        String inches = scan.nextLine();
        String result2 = inchToMeter(Integer.valueOf(inches)); // Integer.valueOf(String) -> int
        System.out.println(result2);
    }

    /**
     * Ex 1
     * Returns a formatted answer that converts fahrenheit into celsius
     *
     * @param fahrenheit Fahrenheit in integer.
     * @return formatted answer (ex. 212.0 degree Fahrenheit is equal to 100.0 in Celsius)
     */
    public static String fahrenheitToCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return fahrenheit + " degree Fahrenheit is equal to " +  celsius + " in Celsius";
    }

    /**
     *
     * @param inches
     * @return
     */
    public static String inchToMeter(int inches) {
        double meters = inches *  0.0254;
        return inches + " inch is " + meters + " meters";
    }

}
