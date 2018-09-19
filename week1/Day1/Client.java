package Day2;

public class Client {
    public static void main(String[] args) {
        User u1 = new User("reiTheJapanese",
                "rei@email.com",
                "1234",
                30,
                "Tokyo",
                "Women");

        u1.login("reiTheJapanese", "1234");
        u1.changeInterest("More Women");
        u1.setUsername("REI");
        u1.getUsername();

    }
}
