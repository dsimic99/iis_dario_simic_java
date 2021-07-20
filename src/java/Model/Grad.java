/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.util.Properties;
import org.xml.sax.ContentHandler;


/**
 *
 * @author dario
 */
public class Grad  {
    private String gradIme;
    private double lat;
    private double lon;
    
    private Podatci podatci;

    public Grad(String gradIme, double lat, double lon, Podatci podatci) {
        this.gradIme = gradIme;
        this.lat = lat;
        this.lon = lon;
        this.podatci = podatci;
    }

    public Grad(String s) {
        this.gradIme = s;
    }

    public String getGradIme() {
        return gradIme;
    }

    public void setGradIme(String gradIme) {
        this.gradIme = gradIme;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Podatci getPodatci() {
        return podatci;
    }

    public void setPodatci(Podatci podatci) {
        this.podatci = podatci;
    }

    

   
}
