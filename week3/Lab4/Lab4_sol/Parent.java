package PairProgramming;

public class Parent extends Employee {
    private int numberOfHoursSpentPerWeekWithKids;
    final double OVERTIME_PAY_RATE=-2.0;

    public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
        super(name);
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.ANYTHING;
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
        return "care";
    }

    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    public int getNumberOfHoursSpentPerWeekWithKids() {
        return numberOfHoursSpentPerWeekWithKids;
    }

    public void setNumberOfHoursSpentPerWeekWithKids(int numberOfHoursSpentPerWeekWithKids) {
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
    }

    @Override
    public String toString() {
        String spaces="";
        for (int i=0; i<20-name.length(); i++){
            spaces+=" ";
        }
        String esub="Parent";
        String spaces2="";
        for (int i=0; i<25-esub.length(); i++){
            spaces2+=" ";
        }
        return "Parent"+ spaces2 + name + spaces +  "spends " + numberOfHoursSpentPerWeekWithKids + " hours/week with kids" ;
    }

    public int compareTo(Object o) {
        if (this.numberOfHoursSpentPerWeekWithKids>((Parent)o).numberOfHoursSpentPerWeekWithKids)
            return 1;
        else if (this.numberOfHoursSpentPerWeekWithKids<((Parent)o).numberOfHoursSpentPerWeekWithKids)
            return -1;
        else
            return 0;
    }

    public boolean equals(Object obj) {
        if (this.getClass()!=obj.getClass() || obj==null)
            return false;
        else {
        if (this.numberOfHoursSpentPerWeekWithKids==((Parent)obj).numberOfHoursSpentPerWeekWithKids)
            return true;
        else
            return false;}
    }


    @Override
    public int hashCode() {
        return numberOfHoursSpentPerWeekWithKids;
    }
}
