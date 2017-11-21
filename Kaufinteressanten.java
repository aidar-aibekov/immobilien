package entities;

import java.util.HashSet;
import java.util.Set;

public class Kaufinteressanten {

    private Integer id_kaufinteressanten;
    private String name;
    private Set<Haus> haeusen;

    public Kaufinteressanten(){

    }

    public Kaufinteressanten(String name){
        this.name = name;
        haeusen = new HashSet<Haus>();
    }

    public Integer getId_kaufinteressanten() {
        return id_kaufinteressanten;
    }

    public void setId_kaufinteressanten(Integer id_kaufinteressanten) {
        this.id_kaufinteressanten = id_kaufinteressanten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Haus> getHaeusen() {
        return haeusen;
    }

    public void setHaeusen(Set<Haus> haeusen) {
        this.haeusen = haeusen;
    }



}
