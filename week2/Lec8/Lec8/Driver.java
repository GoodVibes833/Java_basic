package Lec8;


public class Driver {
    public static void main(String[] args) {
        String fn = "Steve";
        String ln = "Jobs";
        // %d : int, %f : float
        double PI = 3.1416235123;
        String result = String.format("firstname: %s%nlastname: %s%n",PI, fn, ln);
        System.out.println(result);
        String formattedPI = String.format("%10.2f", PI);
        System.out.printf("firstname: %s%nlastname: %s%n",PI, fn, ln);
        // cmd + d : duplicate a line
        System.out.println(formattedPI);

        Flyable a = new IronMan("",10);

    }
}
