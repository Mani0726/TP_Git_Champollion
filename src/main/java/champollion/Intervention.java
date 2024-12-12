package champollion;

import java.util.Date;

public class Intervention {

    private Date date;
    private int duree;
    private boolean annulee;
    private int heureDebut;

    public Intervention(Date d, int du, boolean a, int hD) {
        this.date = d;
        this.duree = du;
        this.annulee = a;
        this.heureDebut = hD;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getDuree() {
        return duree;
    }
    public void setDuree(int duree) {
        this.duree = duree;
    }
    public boolean isAnnulee() {
        return annulee;
    }
    public void setAnnulee(boolean annulee) {
        this.annulee = annulee;
    }
    public int getHeureDebut() {
        return heureDebut;
    }
    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }


}
