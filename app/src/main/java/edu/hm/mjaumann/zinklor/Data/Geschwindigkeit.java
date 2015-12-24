package edu.hm.mjaumann.zinklor.Data;

import java.io.Serializable;

/**
 * Created by Michael on 14.11.2015.
 */
public class Geschwindigkeit implements Serializable {
    private int wege;
    private int centimeter;

    public Geschwindigkeit(int centimeter, int wege) {
        this.centimeter = centimeter;
        this.wege = wege;
    }

    @Override
    public String toString() {
        return "Geschwindigkeit{" +
                "wege=" + wege +
                ", centimeter=" + centimeter +
                '}';
    }

    public int getCentimeter() {
        return centimeter;
    }

    public int getWege() {
        return wege;
    }
}
