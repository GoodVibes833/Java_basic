package Day3;

public class Client {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        Die d1 = new Die();
        Die d2 = new Die();
        System.out.println(d1.equals(d2));

        String a = "Hello";
        String b = "Hello";
        a.equals(b);

    }
}
