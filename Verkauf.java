package entities;

import javax.persistence.criteria.CriteriaBuilder;

public class Verkauf {


    private Integer id_verkauf;
    private String name;
    private String datum;
    private String telefonnummer;
    private Verkauf verkauf;

    public Verkauf(){

    }

    public Verkauf(String name, String datum, Verkauf verkauf){
        this.name = name;
        this.datum = datum;
        verkauf = new Verkauf();

    }

    public Integer getId_verkauf() {
        return id_verkauf;
    }

    public void setId_verkauf(Integer id_verkauf) {
        this.id_verkauf = id_verkauf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public Verkauf getVerkauf() {
        return verkauf;
    }

    public void setVerkauf(Verkauf verkauf) {
        this.verkauf = verkauf;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}
