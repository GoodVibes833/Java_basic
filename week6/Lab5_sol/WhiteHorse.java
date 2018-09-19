package Lab;

public class WhiteHorse implements Horse {
    private String name;
    private int weight;
    private String country;

    public WhiteHorse(String name, int weight, String country) {
        this.name = name;
        this.weight = weight;
        this.country = country;
    }

    @Override
    public String toString() {
        return "White Horse : " + name + ", Weight: " + weight;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name ;
    }
}
