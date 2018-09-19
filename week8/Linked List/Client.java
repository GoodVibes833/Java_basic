package Chapter16;

import java.util.*;

public class Client {
    public static void main(String[] args) {


        String[] colors = {"BLUE", "GREEN", "YELLOW", "RED", "WHITE"};
        List<String> colorlist = new LinkedList<>(Arrays.asList(colors));
        colorlist.add(0, "CYAN");
        colorlist.size();
        String[] removeColors = {"RED", "WHITE", "BLUE"};

        List<String> removeList = new ArrayList<>(Arrays.asList(removeColors));
        removeList.add(0, "CYAN");

        removeElementsFrom(colorlist, removeList);

        System.out.println(colorlist);

        Collections.shuffle(colorlist);
        Collections.reverse(colorlist);
        Collections.sort(colorlist);
        Collections.min(colorlist);
        Collections.max(colorlist);
        Collections.frequency(colorlist, "RED");

        // Implementation
        Collections.binarySearch(colorlist, "RED");
        

    }

    private static void removeElementsFrom(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }

}
