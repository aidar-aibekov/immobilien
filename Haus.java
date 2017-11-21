package entities;

import java.util.HashSet;
import java.util.Set;

public class Haus {

    private Integer id_haus;
    private String address;
    private Integer schaetzung;
    private Integer preis;
    private Besitzer besitzer;
    private Set<Kaufinteressanten> kaufinteressanten;
    private Set<Verkauf> verkaefer;

    public Haus() {
    }

    public Haus(String address, int schaetzung, int preis, Besitzer besitzer) {
        this.address = address;
        this.schaetzung = schaetzung;
        this.preis = preis;
        besitzer = new Besitzer();
        kaufinteressanten = new HashSet<Kaufinteressanten>();
        verkaefer = new HashSet<Verkauf>();
    }

    public Integer getId_haus() {
        return id_haus;
    }

    public void setId_haus(Integer id_haus) {
        this.id_haus = id_haus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSchaetzung() {
        return schaetzung;
    }

    public void setSchaetzung(Integer schaetzung) {
        this.schaetzung = schaetzung;
    }

    public Integer getPreis() {
        return preis;
    }

    public void setPreis(Integer preis) {
        this.preis = preis;
    }

    public Besitzer getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(Besitzer besitzer) {
        this.besitzer = besitzer;
    }

    public Set<Kaufinteressanten> getKaufinteressanten() {
        return kaufinteressanten;
    }

    public void setKaufinteressanten(Set<Kaufinteressanten> kaufinteressanten) {
        this.kaufinteressanten = kaufinteressanten;
    }

    public Set<Verkauf> getVerkaefer() {
        return verkaefer;
    }

    public void setVerkaefer(Set<Verkauf> verkaefer) {
        this.verkaefer = verkaefer;
    }


}
