package Chapter14;

public class Client {

    public static void main(String[] args) {

        OurStringBuilder a = new OurStringBuilder("Hello");
        a.reverse();
        System.out.println(a);
    }
}
