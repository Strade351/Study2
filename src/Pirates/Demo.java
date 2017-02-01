package Pirates;

/**
 * Created by ABondarev on 01.02.2017.
 */
public class Demo {
    public static void main(String[] args) {
        String[] pirates = {"Silver", "Jack", "BlackBeard", "Cook", "Hook"};
        int[] pgold = {200, 100, 250, 50, 5};
        printGold(pirates, pgold);
        sortPirates(pirates, pgold);
        printGold(pirates, pgold);
    }

static void printGold(String[] pirates, int[] pgold) {
    for (int i = 0; i < pirates.length; i++) {
            System.out.println(pirates[i] + " " + pgold[i]);
    }
    System.out.println("-------------------------------------------");
}

static void sortPirates(String[] pirates, int[] pgold) {
    int tempg = 0;
    String tempp;
    for (int i = 0; i < pirates.length; i++) {
        for (int j = 0; j < pgold.length; j++) {
            if (pgold[j] < pgold[i]) {
                tempg = pgold[i];
                pgold[i] = pgold[j];
                pgold[j] = tempg;
                tempp = pirates[i];
                pirates[i] = pirates[j];
                pirates[j] = tempp;
            }
        }
    }
}
}
