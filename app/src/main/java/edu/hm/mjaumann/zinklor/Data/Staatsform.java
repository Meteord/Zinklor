package edu.hm.mjaumann.zinklor.Data;

/**
 * Created by Michael on 14.11.2015.
 */
public class Staatsform {
    private String bringt;
    private String name;

    public Staatsform(String bringt, String name) {
        this.bringt = bringt;
        this.name = name;
    }

    public String getBringt() {
        return bringt;
    }

    public String getName() {
        return name;
    }
}
