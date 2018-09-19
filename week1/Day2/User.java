package Day2;

public class User {
    public static final int productID = 1234;
    private String username;
    private String email;
    private String password;
    private int age;
    private String city;
    private String interest;

    // Method Overloading
    public User(String username, String email,
                String password, int age,
                String city, String interest) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.city = city;
        this.interest = interest;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean login(String un, String pw) {
        if (this.username.equals(un) && this.password.equals(pw)) {
            System.out.println(username + " is successfully logged in.");
            return true;
        } else if (this.username.equals(un)) {
            System.out.println("Wrong Password.");
            return false;
        } else if (this.password.equals(pw)) {
            System.out.println("Wrong Username.");
            return false;
        } else {
            System.out.println("Who are you? go away!");
            return false;
        }
    }

    private String createLogoutMessage() {
        return "USERNAME: " + this.username + "\nPASSWORD: " + this.password;
    }

    public void logout() {
        System.out.println(this.createLogoutMessage());
        System.out.println("Bye!");
    }

    public void changeInterest(String newInterest) {
        System.out.println(this.username
                + " changed current interest from "
                + this.interest + " to " + newInterest);
        this.interest = newInterest;
    }

    // getters
    public String getUsername(){
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCity() {
        return this.city;
    }

    public String getInterest() {
        return this.interest;
    }

    // setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
