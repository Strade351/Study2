package Pirates;

/**
 * Created by ABondarev on 01.02.2017.
 */
public class Pirate implements Comparable<Pirate>{
    private String name;
    private int gold;
    Pirate(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    static void printPirate(String[] pirates, int[] pgold) {
        for (int i = 0; i < pirates.length; i++) {
            System.out.println(pirates[i] + " " + pgold[i]);
        }
        System.out.println("-------------------------------------------");
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public int compareTo(Pirate o) {
        return gold - o.gold;
    }
}