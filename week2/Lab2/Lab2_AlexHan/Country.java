package Lab2;

/**
 * @author Alex Han
 */
public class Country {

    /**
     * variables
     */
        private String name ="Canada";
        private Province[] pros; // arrayType[] arrayName;


    /**
     * Constructor,
     * when Country class called, below instances are created.
     */
        public Country() {
            Province asd = new Province(); // normal instance.

//            array type instance
            this.pros = new Province[10];
            this.pros[0] = new Province("Ontario", "Toronto", 13);
            this.pros[1] = new Province("Quebec", "Quebec City", 8);
            this.pros[2] = new Province("British Columbia", "Victoria", 4);
            this.pros[3] = new Province("Alberta", "Edmonton", 4);
            this.pros[4] = new Province("Manitoba", "Winnipeg", 1);
            this.pros[5] = new Province("Saskatchewan", "Regina", 1);
            this.pros[6] = new Province("Nova Scotia", "Halifax", (int) 0.9);
            this.pros[7] = new Province("New Brunswick", "Fredericton", (int) 0.7);
            this.pros[8] = new Province("Newfoundland and Labrador", "St. John's", (int) 0.5);
            this.pros[9] = new Province("Prince Edward Island", "Charlottetown", (int) 0.1);

        }

    /**
     * show all instances info with get.Detail() method.
     */
        public void displayAllProvinces(){
            for(Province province :pros) {
                System.out.println(province.getDetails());
            }

        }

    /**
     *
     * @param min minimum population
     * @param max maximum population
     * @return how many provinces are with in the range
     */
        public int howManyHaveThisPopulation(int min, int max){
            int count = 0;
            for(Province province :this.pros) {
                if (province.getPopulationMillions() >= min && province.getPopulationMillions() <= max) {
                    count++;
                }
            }
            System.out.println(count);
            return count;
        }



}
