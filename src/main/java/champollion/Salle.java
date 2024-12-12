package champollion;

public class Salle {

    private int capacite;
    private String intitule;

    public Salle(int c, String i) {
        this.capacite = c;
        this.intitule = i;
    }
    public int getCapacite() {
        return capacite;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}


