package Lab2;

/**
 * @author Alex Han
 */

/**
 * variables
 */
public class Province {
    private String name;
    private String capital;
    private int populationMillions;

    private final static String DEFAULT_PROVINCE = "British Columbia" ;
    private final static String DEFAULT_CAPITAL = "Victoria";
    private final static int DEFAULT_POPULATION_MILLIONS = 4;

    /**
     * Calpital list
     */
    private String[] capitalArray = {
            "Toronto",
            "Quebec City",
            "Victoria",
            "Edmonton",
            "Winnipeg",
            "Regina",
            "Halifax",
            "Fredericton",
            "St. John's",
            "Charlottetown"
    };

    /**
     * Province list
     */
    private String[] provincesArray = {
            "Ontario", "ON",
            "Quebec", "QC",
            "British Columbia", "BC",
            "Alberta", "AB",
            "Manitoba", "MB",
            "Saskatchewan", "SK",
            "Nova Scotia", "NS",
            "New Brunswick", "NB",
            "Newfoundland and Labrador", "NL",
            "Prince Edward Island", "PE",
            "Northwest Territories", "NT",
            "Nunavut", "NU",
            "Yukon", "YT"
    };

    /**
     * Constructor1
     * @param name name of province
     * @param capital name of capital(main city)
     * @param populationMillions population with million unit
     */
    public Province(String name, String capital, int populationMillions)
    {
        if ((isValidPopulation(populationMillions)) && (isValidProvince(name)) && (isValidCapitalCity(capital))) {
            this.name = name;
            this.capital = capital;
            this.populationMillions = populationMillions;

        } else {
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationMillions = DEFAULT_POPULATION_MILLIONS; }}


    /**
     * constructor2 : return default values like below
     */
    public Province() {

            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationMillions = DEFAULT_POPULATION_MILLIONS; }


    /**
     * Province condition : check if the input value is in the Province array
     * @param name name of province
     * @return true or false
     */
    private boolean isValidProvince(String name){

        for (String aProvincesArray : provincesArray) {
            if (aProvincesArray.equals(name)) {
                return true;
            }

        }
        return false;
    }

    /**
     * Capital condition : check if the input value is in the Capital array
     * @param capital capital city
     * @return true or false
     */
    private boolean isValidCapitalCity(String capital){

        for (String aCapitalArray : capitalArray) {
            if (aCapitalArray.equals(capital)) {
                return true;
            }

        }
        return false;
    }

    /**
     * Population condition : check if the input value is within the range
     * @param populationMillions pup with Million unit
     * @return true of false
     */
    private boolean isValidPopulation(int populationMillions){
            if(populationMillions>=4 && populationMillions<=38){
                 return true;
            }
        return false;}



    /**
     *
     * @return populationMillions
     */
    public int getPopulationMillions() {
        return populationMillions;
    }

    /**
     *
     * @return capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param capital mutator of capital
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     *
     * @param name mutator of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param populationMillions mutator of populationMillions
     */
    public void setPopulationMillions(int populationMillions) {
        this.populationMillions = populationMillions;
    }


    /**
     *
     * @return shows capital, province, and population with a sentense.
     */
    public String getDetails(){
        return "The capital of " + this.name  +" (pop. "+this.populationMillions +" million) is "+ this.capital+ " .";
    }

}


