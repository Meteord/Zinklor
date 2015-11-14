package edu.hm.mjaumann.zinklor.Data;

import java.util.ArrayList;

/**
 * Created by Michael on 14.11.2015.
 */
public class allData {
    private ArrayList<Einheit> einheiten;
    private ArrayList<Erforschung> erforschungs;
    private ArrayList<Staatsform> staatsforms;

    public allData(ArrayList<Einheit> einheiten, ArrayList<Erforschung> erforschungs, ArrayList<Staatsform> staatsforms) {
        this.einheiten = einheiten;
        this.erforschungs = erforschungs;
        this.staatsforms = staatsforms;
    }

    public Einheit[] sucheEinheit(final String name)
    {
        final ArrayList<Einheit> suchergebnisse = new ArrayList<>();
        for (Einheit iterator:einheiten
             ) {
            if(iterator.getName().contains(name))
            {
                suchergebnisse.add(iterator);
            }
        }
        return (Einheit[]) suchergebnisse.toArray();
    }

    public Erforschung[] sucheErforschung(final String name)
    {
        final ArrayList<Erforschung> suchergebnisse = new ArrayList<>();
        for (Erforschung iterator:erforschungs
                ) {
            if(iterator.getName().contains(name))
            {
                suchergebnisse.add(iterator);
            }
        }
        return (Erforschung[]) suchergebnisse.toArray();
    }
    public void addEinheit(final Einheit einheit)
    {
        einheiten.add(einheit);
    }

    public void addErforschungen(final Erforschung erforschung)
    {
        erforschungs.add(erforschung);
    }

    public void bearbeiteEinheit(final int einheitenid, Einheit einheit)
    {
        Einheit old;
        for (Einheit ein:einheiten
             ) {
            if(einheit.getId() == einheitenid)
            {
                old = ein;
                break;
            }
        }
        /*if(old != null)
        {
            einheiten.remove(old);
            if(einheit.getId() == einheitenid)
                einheiten.add(einheit);
            else
                einheiten.add(new Einheit(einheitenid,einheit));
        }*/
    }
}
