package edu.hm.mjaumann.zinklor.Data;

import java.io.Serializable;

/**
 * Created by Michael on 14.11.2015.
 */
public class Transport implements Serializable {
    private int einheiten;
    private int rohstoffe;

    public Transport(int einheiten, int rohstoffe) {
        this.einheiten = einheiten;
        this.rohstoffe = rohstoffe;
    }

    public int getEinheiten() {
        return einheiten;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "einheiten=" + einheiten +
                ", rohstoffe=" + rohstoffe +
                '}';
    }

    public int getRohstoffe() {
        return rohstoffe;
    }
}
