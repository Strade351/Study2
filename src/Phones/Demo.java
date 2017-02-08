package Phones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by ABondarev on 08.02.2017.
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Phone> phones = null;
        phones.add(new Phone(3.2, 8, 3200));
        Collections.sort(phones, ((o1, o2)-> o1.getCharge() - o2.getCharge()));
        Collections.sort(phones);
        phones.sort(new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return (int) (o1.getWeight() - o2.getWeight());
            }
        });

    }
}
