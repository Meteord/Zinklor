package edu.hm.mjaumann.zinklor.Data;

public class Einheit {
    private String name;
    private String abkrzg;
    private Kosten kosten;
    private int Kraft;
    private Geschwindigkeit geschw;
    private Transport transport;

    private int id;
    private boolean fliegend;
    private String effekt;
    private String kommentar;

    public Einheit(String name, String abkrzg, Kosten kosten, int kraft, Geschwindigkeit geschw, Transport transport, int id, boolean fliegend, String effekt, String kommentar) {
        this.name = name;
        this.abkrzg = abkrzg;
        this.kosten = kosten;
        Kraft = kraft;
        this.geschw = geschw;
        this.transport = transport;
        this.id = id;
        this.fliegend = fliegend;
        this.effekt = effekt;
        this.kommentar = kommentar;
    }
    public Einheit(final int id, final Einheit einheit)
    {
        this.id = id;
        abkrzg = einheit.getAbkrzg();
        kosten = einheit.getKosten();
        Kraft = einheit.getKraft();
        this.geschw = einheit.getGeschw();
        this.transport = einheit.getTransport();
        this.fliegend = einheit.isFliegend();
        this.effekt = einheit.getEffekt();
        this.kommentar = einheit.getKommentar();
    }

    public String getName() {
        return name;
    }

    public String getAbkrzg() {
        return abkrzg;
    }

    public Kosten getKosten() {
        return kosten;
    }

    public int getKraft() {
        return Kraft;
    }

    public Geschwindigkeit getGeschw() {
        return geschw;
    }

    public Transport getTransport() {
        return transport;
    }

    public int getId() {
        return id;
    }

    public boolean isFliegend() {
        return fliegend;
    }

    public String getEffekt() {
        return effekt;
    }

    public String getKommentar() {
        return kommentar;
    }
}
