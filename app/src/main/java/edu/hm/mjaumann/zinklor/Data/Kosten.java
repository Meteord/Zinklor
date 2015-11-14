package edu.hm.mjaumann.zinklor.Data;


public class Kosten {
    private int Holz;
    private int Gold;
    private int Mana;

    private int Stein;

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
