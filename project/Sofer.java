package project;

public class Sofer extends Angajat{
    private String vehicul;
    private int experienta;
    private boolean inCursa;

    public Sofer(String nume, String prenume, String gen, int varsta, int salariu, int vechime, String vehicul, int experienta, boolean inCursa) {
        super(nume, prenume, gen, varsta, salariu, vechime);
        this.vehicul = vehicul;
        this.experienta = experienta;
        this.inCursa = inCursa;
    }

    public String getVehicul() {
        return vehicul;
    }

    public void setVehicul(String vehicul) {
        this.vehicul = vehicul;
    }

    public int getExperienta() {
        return experienta;
    }

    public void setExperienta(int experienta) {
        this.experienta = experienta;
    }

    public boolean isInCursa() {
        return inCursa;
    }

    public void setInCursa(boolean inCursa) {
        this.inCursa = inCursa;
    }
}
