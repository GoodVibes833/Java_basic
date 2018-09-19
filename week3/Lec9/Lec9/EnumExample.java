package Lec9;

public class EnumExample {

    public static void main(String[] args) {

        Person p1 = new Person("Derrick", 21, Season.SPRING);
        Person p2 = new Person("Derrick", 21,  Season.SUMMER);

        Season myFavorite = Season.SUMMER;
        System.out.println(myFavorite);
        System.out.println(myFavorite.ordinal());
        switch (myFavorite){
            case SUMMER:
                System.out.println();
                break;
            case FALL:
                System.out.println();
                break;
            case SPRING:
                System.out.println();
                break;
            case WINTER:
                break;
        }

    }
}
