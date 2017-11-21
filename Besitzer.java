package entities;

public class Besitzer {

    private Integer id_besitzer;
    private String name;
    private String telefonnummer;
    private Haus haus;

    public Besitzer() {
    }

    public Besitzer(String name, String telefonnummer, Haus haus) {
        this.name = name;
        this.telefonnummer = telefonnummer;
        this.haus = haus;
    }
    public Integer getId_besitzer() {
        return id_besitzer;
    }

    public void setId_besitzer(Integer id_besitzer) {
        this.id_besitzer = id_besitzer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public Haus getHaus() {
        return haus;
    }

    public void setHaus(Haus haus) {
        this.haus = haus;
    }

}
