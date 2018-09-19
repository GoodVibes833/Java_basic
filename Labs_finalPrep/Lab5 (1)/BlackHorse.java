package Lab;

public class BlackHorse implements Horse {
    private String name;
    private int weight;
    private String country;

    public BlackHorse(String name, int weight, String country) {
        this.name = name;
        this.weight = weight;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Black Horse : " + name + ", Weight: " + weight;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
