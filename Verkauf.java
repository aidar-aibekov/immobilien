package DB2Project;

public class Verkauf {

    int id_verkauf;
    int haus_id;

    public Verkauf(int haus_id) {
        this.haus_id = haus_id;
    }

    public int getId_verkauf() {
        return id_verkauf;
    }

    public void setId_verkauf(int id_verkauf) {
        this.id_verkauf = id_verkauf;
    }

    public int getHaus_id() {
        return haus_id;
    }

    public void setHaus_id(int haus_id) {
        this.haus_id = haus_id;
    }

    @Override
    public String toString() {
        return "Verkauf{" +
                "id_verkauf=" + id_verkauf +
                ", haus_id=" + haus_id +
                '}';
    }
}
