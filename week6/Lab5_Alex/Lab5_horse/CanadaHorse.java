package Lab5_horse;

public class CanadaHorse implements Horse {
    String name;
    int weight;


    public CanadaHorse(String name, int weight) {
        this.name = name;
        this.weight = weight;
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
