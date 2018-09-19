package PairProgramming;

public class Professor extends Employee {
    private String teachingMajor;
    final double OVERTIME_PAY_RATE=2.0;

    public Professor(String name, String teachingMajor) {
        super(name);
        this.teachingMajor = teachingMajor;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.FANCY;
    }

    @Override
    public boolean isPaidSalary() {
        return true;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return true;
    }

    @Override
    public String getWorkVerb() {
        return "teach";
    }

    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    public String getTeachingMajor() {
        return teachingMajor;
    }

    public void setTeachingMajor(String teachingMajor) {
        this.teachingMajor = teachingMajor;
    }

    @Override
    public String toString() {
        String spaces="";
        for (int i=0; i<20-name.length(); i++){
            spaces+=" ";
        }
        String esub="Professor";
        String spaces2="";
        for (int i=0; i<25-esub.length(); i++){
            spaces2+=" ";
        }
        return "Professor" + spaces2 + name + spaces + "teaches " + teachingMajor;
    }

    public int compareTo(Object o) {
        if (this.teachingMajor.equalsIgnoreCase("Computer Systems") &&
                !((Professor)o).teachingMajor.equalsIgnoreCase("Computer Systems"))
            return 1;
        else if (!this.teachingMajor.equalsIgnoreCase("Computer Systems") &&
                ((Professor)o).teachingMajor.equalsIgnoreCase("Computer Systems"))
            return -1;
        else
            return 0;
    }

    public boolean equals(Object obj) {
        if (this.getClass()!=obj.getClass() || obj==null)
            return false;
        else {
        if (this.teachingMajor.equalsIgnoreCase(((Professor)obj).teachingMajor))
            return true;
        else
            return false;}
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = teachingMajor.hashCode();
        temp = Double.doubleToLongBits(OVERTIME_PAY_RATE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
