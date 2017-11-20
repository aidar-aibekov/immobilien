package DB2Project;

public class Kaufinteressanten {

    int id_kaufinteressanten;
    String name;

    public Kaufinteressanten(String name) {
        this.name = name;
    }

    public int getId_kaufinteressanten() {
        return id_kaufinteressanten;
    }

    public void setId_kaufinteressanten(int id_kaufinteressanten) {
        this.id_kaufinteressanten = id_kaufinteressanten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kaufinteressanten{" +
                "id_kaufinteressanten=" + id_kaufinteressanten +
                ", name='" + name + '\'' +
                '}';
    }
}
