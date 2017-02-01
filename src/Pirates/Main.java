package Pirates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by ABondarev on 01.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Pirate> pirates = new ArrayList<Pirate>();
        pirates.add(new Pirate("Silver", 200));
        pirates.add(new Pirate("Jack", 100));
        pirates.add(new Pirate("BlackBeard", 250));
        pirates.add(new Pirate("Cook", 50));
        pirates.add(new Pirate("Hook", 5));
        //Collections.sort(pirates);
        /*pirates.sort(new Comparator<Pirate>() {
            @Override
            public int compare(Pirate o1, Pirate o2) {
                if (o1.getGold() == o2.getGold())
                    return 0;
                else
                    return (o1.getGold() > o2.getGold())?1:-1;
            }
        });
        */
        Collections.sort(pirates, ((o1, o2)-> o1.getGold() - o2.getGold()));
        for (int i = 0; i < pirates.size(); i++) {
            System.out.println(pirates.get(i).getName() + pirates.get(i).getGold());
        }
    }
}
