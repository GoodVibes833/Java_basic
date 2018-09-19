package Lab5_horse;

public class Client {


    public static void main(String[] args) {


    Horse Korea1 = new KoreaHorse("ko1", 123);
    Horse Korea2 = new KoreaHorse("ko2", 123);
    CanadaHorse Canada1 = new CanadaHorse("ca1", 123);
    CanadaHorse Canada2 = new CanadaHorse("ca2", 123);
    HorseBarn barn1 = new HorseBarn(6);


    barn1.addHorsetoBarn(0,Korea1);
    barn1.addHorsetoBarn(3,Korea2);
    barn1.addHorsetoBarn(5,Canada1);

    System.out.println(barn1.findHorseSpace("ko1"));
    System.out.println(barn1.findHorseSpace("ko2"));
    System.out.println(barn1.findHorseSpace("ca1"));

    //[ko1,null,null,ko2,null,ca1]

        barn1.consolidate();

        System.out.println(barn1.findHorseSpace("ko1"));
        System.out.println(barn1.findHorseSpace("ko2"));
        System.out.println(barn1.findHorseSpace("ca1"));

    }




}
