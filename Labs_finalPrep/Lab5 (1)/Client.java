package Lab;

public class Client {

    public static void main(String[] args) {
        Horse h1 = new BlackHorse("David", 200, "Canada");
        Horse h2 = new WhiteHorse("Dexon", 150, "Canada");
        Horse h3 = new WhiteHorse("Aaron", 250, "Brazil");


        HorseBarn vanBarn = new HorseBarn(5);
        // [h1, null, h2, null, h3]
        vanBarn.addHorse(0, h1);
        vanBarn.addHorse(2, h2);
        vanBarn.addHorse(4, h3);

        vanBarn.displaySpaces();

        System.out.println(vanBarn.findHorseSpace("Dexon"));

        System.out.println("Consolidate!!");
        vanBarn.consolidate();
        vanBarn.displaySpaces();

    }
}
