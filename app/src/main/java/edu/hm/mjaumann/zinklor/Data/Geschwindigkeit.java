package edu.hm.mjaumann.zinklor.Data;

/**
 * Created by Michael on 14.11.2015.
 */
public class Geschwindigkeit {
    private int wege;
    private int centimeter;

    public Geschwindigkeit(int centimeter, int wege) {
        this.centimeter = centimeter;
        this.wege = wege;
    }

    public int getCentimeter() {
        return centimeter;
    }

    public int getWege() {
        return wege;
    }
}
