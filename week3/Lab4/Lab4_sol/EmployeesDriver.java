package PairProgramming;

import java.util.*;

public class EmployeesDriver {
    public static void main(String[] args) {
        Employees e1=new Employees();

        System.out.println(e1);

        System.out.println("-------------------------------------------");
        System.out.println();

        System.out.println(e1.printHockeyPlayers());
        Collections.sort(e1.getHockeyPlayers());
        System.out.println(e1.printHockeyPlayers());

        System.out.println("-------------------------------------------");
        System.out.println();

        System.out.println(e1.printProfessors());
        Collections.sort(e1.getProfessors());
        System.out.println(e1.printProfessors());

        System.out.println("-------------------------------------------");
        System.out.println();

        System.out.println(e1.printParents());
        Collections.sort(e1.getParents());
        System.out.println(e1.printParents());

        System.out.println("-------------------------------------------");
        System.out.println();

        System.out.println(e1.printGasStationAttendant());
        Collections.sort(e1.getGasStationAttendants());
        System.out.println(e1.printGasStationAttendant());


        System.out.println("-------------------------------------------");
        System.out.println();

        System.out.println(e1.printTheSameType());

    }
}
