package Lab2;

/**
 * Created by Derrick on 2018-03-22.
 */
public class Country {
    private String name = "Canada";
    private Province[] provinces;

    public Country() {
        
        this.provinces = new Province[10];
        this.provinces[0] = new Province("Ontario", "Toronto", 13);
        this.provinces[1] = new Province("Quebec", "Quebec City", 8);
        this.provinces[2] = new Province("British Columbia", "Victoria", 4);
        this.provinces[3] = new Province("Alberta", "Edmonton", 4);
        this.provinces[4] = new Province("Manitoba", "Winnipeg", 1);
        this.provinces[5] = new Province("Saskatchewan", "Regina", 1);
        this.provinces[6] = new Province("Nova Scotia", "Halifax", (int) 0.9);
        this.provinces[7] = new Province("New Brunswick", "Fredericton", (int) 0.7);
        this.provinces[8] = new Province("Newfoundland and Labrador", "St. John's", (int) 0.5);
        this.provinces[9] = new Province("Prince Edward Island", "Charlottetown", (int) 0.1);

    }
    public void displayAllProvinces() {
        for(Province province :this.provinces) {
            System.out.println(province.getDetails());
        }
    }
    public int howManyHaveThisPopulation(int min, int max) {
        int count = 0;
        for(Province province :this.provinces) {
            if (province.getPopulationInMillions() >= min && province.getPopulationInMillions() <= max) {
                count++;
            }
        }
        return count;
    }
}
