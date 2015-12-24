package edu.hm.mjaumann.zinklor.Data;

import android.app.Application;
import android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Michael on 14.11.2015.
 */
public class allData extends Application implements Serializable {
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

    public static boolean saveObject(allData obj, Context c) {
        final File suspend_f=new File(c.getFilesDir(), "test");

        FileOutputStream fos  = null;
        ObjectOutputStream oos  = null;
        boolean            keep = true;

        try {
            fos = new FileOutputStream(suspend_f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (Exception e) {
            keep = false;
        } finally {
            try {
                if (oos != null)   oos.close();
                if (fos != null)   fos.close();
                if (keep == false) suspend_f.delete();
            } catch (Exception e) { /* do nothing */ }
        }

        return keep;
    }

    public static allData getObject(Context c) {
        final File suspend_f=new File(c.getFilesDir(), "test");

        allData simpleClass= null;
        FileInputStream fis = null;
        ObjectInputStream is = null;

        try {
            fis = new FileInputStream(suspend_f);
            is = new ObjectInputStream(fis);
            simpleClass = (allData) is.readObject();
        } catch(Exception e) {
            String val= e.getMessage();
        } finally {
            try {
                if (fis != null)   fis.close();
                if (is != null)   is.close();
            } catch (Exception e) { }
        }

        return simpleClass;
    }
}
