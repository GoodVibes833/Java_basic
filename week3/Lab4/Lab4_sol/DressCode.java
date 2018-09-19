package PairProgramming;

/**
 * Created by Derrick on 2018-04-04.
 */
public enum DressCode {
    JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");

    private String value;
    DressCode(String value) {
        this.value = value;
    }
}
