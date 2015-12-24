package edu.hm.mjaumann.zinklor.Data;


import java.io.Serializable;

public class Kosten implements Serializable{
    private int Holz;
    private int Gold;
    private int Mana;

    private int Stein;

    @Override
    public String toString() {
        return "Kosten{" +
                "Holz=" + Holz +
                ", Gold=" + Gold +
                ", Mana=" + Mana +
                ", Stein=" + Stein +
                '}';
    }

    public Kosten(int holz, int gold, int mana, int stein) {

        Holz = holz;
        Gold = gold;
        Mana = mana;
        Stein = stein;
    }

    public int getHolz() {
        return Holz;
    }

    public int getGold() {
        return Gold;
    }

    public int getMana() {
        return Mana;
    }

    public int getStein() {
        return Stein;
    }
}
