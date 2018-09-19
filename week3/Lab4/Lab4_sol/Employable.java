package PairProgramming;

public interface Employable {
    /**
     * Returns the DressCode of the employee, which is defined by enum
     * @return JERSEY/FANCY/ANYTHING/UNIFORM
     */

    DressCode getDressCode();

    /**
     *Return a boolean of the specified employee is paid or not
     * @return true/false
     *
     */
    boolean isPaidSalary();

    /**
     *Return if the this position required a post Secondary Education
     * @return true/false
     */
    boolean postSecondaryEducationRequired();

    /**
     *Return a string briefly decrise the work they do
     * @return a word
     */
    String getWorkVerb();

}
