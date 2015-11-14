package edu.hm.mjaumann.zinklor.Data;

/**
 * Created by Michael on 14.11.2015.
 */
public class Erforschungskosten extends Kosten {
    private int rundenzahl;

    public Erforschungskosten(int holz, int gold, int mana, int stein, int rundenzahl) {
        super(holz, gold, mana, stein);
        this.rundenzahl = rundenzahl;
    }

    public int getRundenzahl() {
        return rundenzahl;
    }
}
