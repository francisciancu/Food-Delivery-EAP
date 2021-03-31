package project;

public class Mancare {
    private int dificultate;
    private String denumire;

    public Mancare(int dificultate, String denumire) {
        this.dificultate = dificultate;
        this.denumire = denumire;
    }

    public int getDificultate() {
        return dificultate;
    }

    public void setDificultate(int dificultate) {
        this.dificultate = dificultate;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
}
