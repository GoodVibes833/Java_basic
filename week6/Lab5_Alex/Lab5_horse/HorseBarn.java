package Lab5_horse;

public class HorseBarn {

    /**
     * The spaces in the barn.
     */
    private Horse[] spaces;

    /**
     * constructor
     * @param size size of horsebarn
     */
    public HorseBarn(int size) {
        this.spaces = new Horse[size];
    }


    /**
     * add new horse to barn
     * @param index location in barn
     * @param horse which horse
     */
    public void addHorsetoBarn(int index, Horse horse){
        spaces[index]=horse;
    }


    /**
     * find the index of  horse
     * @param name horse that want to find
     * @return index num
     */
    public int findHorseSpace(String name){
        for(int i = 0; i<spaces.length; i++){
            if(spaces[i]!=null&&name.equals(spaces[i].getName())){
                return i;
            }
            }return -1;
    }

    /**
     * shift all horse to left
     */
    public void consolidate(){

        int j=0;
        Horse[] newbarn = new Horse[spaces.length];
        for(int i =0; i<spaces.length; i++){
            if(spaces[i]!=null){
            newbarn[j]=spaces[i];
            j++;
        }

        }
        spaces=newbarn;
    }
    // i
    //[ko1,null,null,ko2,null,ca1]
    // j
    //[ko1,ko2,ca1,null,null,null]




}

