package edu.hm.mjaumann.zinklor.Data;

import java.io.Serializable;

/**
 * Created by Michael on 14.11.2015.
 */
public class Erforschung implements Serializable {
    private String name;
    private int id;
    private String auswirkung;
    private Erforschungskosten kosten;
    private Einheit[] nutznieser;

    public Erforschung(String name, int id, String auswirkung, Erforschungskosten kosten, Einheit[] nutznieser) {
        this.name = name;
        this.id = id;
        this.auswirkung = auswirkung;
        this.kosten = kosten;
        this.nutznieser = nutznieser;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAuswirkung() {
        return auswirkung;
    }

    public Erforschungskosten getKosten() {
        return kosten;
    }

    public Einheit[] getNutznieser() {
        return nutznieser;
    }
}
