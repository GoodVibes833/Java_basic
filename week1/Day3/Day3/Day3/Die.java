package Day3;


public class Die {
    // states
    private int faceValue;
    private final int MAX = 6;

    // constructor
    public Die() {
        this.faceValue = 1;
    }

    // behaviors
    public void roll(){
        // generating a random integer.
        int rand = (int)(Math.random() * MAX) + 1;
        this.faceValue = rand;

    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return "Die: " + this.faceValue;
    }

    @Override
    public boolean equals(Object obj) {

        return this.faceValue == ((Die)obj).faceValue;
    }
}
