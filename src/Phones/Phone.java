package Phones;

/**
 * Created by ABondarev on 08.02.2017.
 */
public class Phone implements Comparable<Phone>{

    private double diag;
    private double weight;
    private int charge;
    Phone(double diag, int weight, int charge) {
        this.diag = diag;
        this.weight = weight;
        this.charge = charge;
    }

    public double getDiag() {
        return diag;
    }

    public double getWeight() {
        return weight;
    }

    public int getCharge() {
        return charge;
    }

    @Override
    public int compareTo(Phone o) {
        if ((diag - o.diag) < 0)
            return -1;
        else if ((diag - o.diag) > 0)
            return 1;
        else
            return 0;
    }
}
