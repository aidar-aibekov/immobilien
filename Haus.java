package DB2Project;

import java.util.ArrayList;
import java.util.Set;

public class Haus {

    int id_haus;
    String address;
    int schaetzung;
    int preis;
    int besitzer_id;
    private ArrayList<Besitzer> hausBesitzer;

    public Haus(String address, int schaetzung, int preis, int besitzer_id) {
        this.address = address;
        this.schaetzung = schaetzung;
        this.preis = preis;
        this.besitzer_id = besitzer_id;
        hausBesitzer = new ArrayList<Besitzer>();
    }

    public int getId_haus() {
        return id_haus;
    }

    public void setId_haus(int id_haus) {
        this.id_haus = id_haus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSchaetzung() {
        return schaetzung;
    }

    public void setSchaetzung(int schaetzung) {
        this.schaetzung = schaetzung;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getBesitzer_id() {
        return besitzer_id;
    }

    public void setBesitzer_id(int besitzer_id) {
        this.besitzer_id = besitzer_id;
    }

    public void setHausBesitzer(ArrayList<Besitzer> besitzer){
        this.hausBesitzer = besitzer;
    }

    public void addBesitzer(Besitzer besitzer){
        hausBesitzer.add(besitzer);
    }

    @Override
    public String toString() {
        return "Haus{" +
                "id_haus=" + id_haus +
                ", address='" + address + '\'' +
                ", schaetzung=" + schaetzung +
                ", preis=" + preis +
                ", besitzer_id=" + besitzer_id +
                '}';
    }
}
