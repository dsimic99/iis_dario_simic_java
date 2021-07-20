/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author dario
 */
class Podatci {
    private double temp;
    private int vlaga;
    private double tlak;
    private String vjetarSmjer;
    private double vjetarBrzina;
    private String vrijeme;
    private String vrijemeZnak;

    public Podatci(double temp, int vlaga, double tlak, String vjetarSmjer, double vjetarBrzina, String vrijeme, String vrijemeZnak) {
        this.temp = temp;
        this.vlaga = vlaga;
        this.tlak = tlak;
        this.vjetarSmjer = vjetarSmjer;
        this.vjetarBrzina = vjetarBrzina;
        this.vrijeme = vrijeme;
        this.vrijemeZnak = vrijemeZnak;
    }

    public Podatci() {
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getVlaga() {
        return vlaga;
    }

    public void setVlaga(int vlaga) {
        this.vlaga = vlaga;
    }

    public double getTlak() {
        return tlak;
    }

    public void setTlak(double tlak) {
        this.tlak = tlak;
    }

    public String getVjetarSmjer() {
        return vjetarSmjer;
    }

    public void setVjetarSmjer(String vjetarSmjer) {
        this.vjetarSmjer = vjetarSmjer;
    }

    public double getVjetarBrzina() {
        return vjetarBrzina;
    }

    public void setVjetarBrzina(double vjetarBrzina) {
        this.vjetarBrzina = vjetarBrzina;
    }

    public String getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(String vrijeme) {
        this.vrijeme = vrijeme;
    }

    public String getVrijemeZnak() {
        return vrijemeZnak;
    }

    public void setVrijemeZnak(String vrijemeZnak) {
        this.vrijemeZnak = vrijemeZnak;
    }
    
    
}
