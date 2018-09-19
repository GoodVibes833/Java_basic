package PairProgramming;

import java.text.DecimalFormat;

public class GasStationAttendant extends Employee {
    private double numberOfDollarsStolenPerDay;
    final double OVERTIME_PAY_RATE=1.5;

    public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
        super(name);
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.UNIFORM;
    }

    @Override
    public boolean isPaidSalary() {
        return false;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    @Override
    public String getWorkVerb() {
        return "pump";
    }

    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    public double getNumberOfDollarsStolenPerDay() {
        return numberOfDollarsStolenPerDay;
    }

    public void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) {
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    @Override
    public String toString() {
        String spaces="";
        for (int i=0; i<20-name.length(); i++){
            spaces+=" ";
        }
        String esub="Gas Station Attendant";
        String spaces2="";
        for (int i=0; i<25-esub.length(); i++){
            spaces2+=" ";
        }
        DecimalFormat fmt=new DecimalFormat("0");
        return "Gas Station Attendant" + spaces2 + name + spaces + "steals " + fmt.format(numberOfDollarsStolenPerDay) + " dollars a day.";
    }

    public int compareTo(Object o) {
        if (this.numberOfDollarsStolenPerDay>((GasStationAttendant)o).numberOfDollarsStolenPerDay)
            return 1;
        else if (this.numberOfDollarsStolenPerDay<((GasStationAttendant)o).numberOfDollarsStolenPerDay)
            return -1;
        else
            return 0;
    }


    public boolean equals(Object obj) {
        if (this.getClass()!=obj.getClass() || obj==null)
            return false;
        else {
        if (this.numberOfDollarsStolenPerDay==((GasStationAttendant)obj).numberOfDollarsStolenPerDay)
            return true;
        else
            return false;}
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(numberOfDollarsStolenPerDay);
        return (int) (temp ^ (temp >>> 32));
    }


}
