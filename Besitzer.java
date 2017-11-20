package DB2Project;

public class Besitzer {

    int id_besitzer;
    String name;
    String telefonnummer;

    public Besitzer(String name, String telefonnummer) {
        this.name = name;
        this.telefonnummer = telefonnummer;
    }

    public int getId_besitzer() {
        return id_besitzer;
    }

    public void setId_besitzer(int id_besitzer) {
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

    @Override
    public String toString() {
        return "Besitzer{" +
                "id_besitzer=" + id_besitzer +
                ", name='" + name + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                '}';
    }
}
