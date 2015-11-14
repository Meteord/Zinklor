package edu.hm.mjaumann.zinklor.Data;

/**
 * Created by Michael on 14.11.2015.
 */
public class Transport {
    private int einheiten;
    private int rohstoffe;

    public Transport(int einheiten, int rohstoffe) {
        this.einheiten = einheiten;
        this.rohstoffe = rohstoffe;
    }

    public int getEinheiten() {
        return einheiten;
    }

    public int getRohstoffe() {
        return rohstoffe;
    }
}
