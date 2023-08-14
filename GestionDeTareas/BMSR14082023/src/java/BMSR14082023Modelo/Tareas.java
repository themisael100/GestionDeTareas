
package BMSR14082023Modelo;


public class Tareas {
    
    private int id;
    private String nom;
    private String Desc;
    private boolean done; 

    public Tareas(String nom, String Desc, boolean done) {
        this.nom = nom;
        this.Desc = Desc;
        this.done = done;
    }

    public Tareas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    
    
}
