package PairProgramming;

import com.sun.javafx.binding.StringFormatter;

public class HockeyPlayer extends Employee {
    private int numberofGoals;
    final double OVERTIME_PAY_RATE=0.0;

    public HockeyPlayer(String name, int numberofGoals) {
        super(name);
        this.numberofGoals = numberofGoals;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.JERSEY;
    }

    @Override
    public boolean isPaidSalary() {
        return true;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    @Override
    public String getWorkVerb() {
        return "play";
    }

    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    public int getNumberofGoals() {
        return numberofGoals;
    }

    public void setNumberofGoals(int numberofGoals) {
        this.numberofGoals = numberofGoals;
    }

    @Override
    public String toString() {
        String spaces="";
        for (int i=0; i<20-name.length(); i++){
            spaces+=" ";
        }

        String esub="Hockey Player";
        String spaces2="";
        for (int i=0; i<25-esub.length(); i++){
            spaces2+=" ";
        }

        return "Hockey Player" + spaces2 + name + spaces + "score "+ numberofGoals + " goals";
    }

    @Override
    public int compareTo(Object o) {
        // if this < Object o -> negative (-1)
        // if this > Object o -> positive (1)
        // if this == Object o -> 0
        if (this.numberofGoals > ((HockeyPlayer)o).numberofGoals)
            return 1;
        else if (this.numberofGoals < ((HockeyPlayer)o).numberofGoals)
            return -1;
        else
            return 0;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HockeyPlayer)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.numberofGoals == ((HockeyPlayer) obj).numberofGoals) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = numberofGoals;
        temp = Double.doubleToLongBits(OVERTIME_PAY_RATE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
