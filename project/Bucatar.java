package project;

public class Bucatar extends Angajat{
    private int aniExperienta;
    private int nivelIndemanare;

    public Bucatar(String nume, String prenume, String gen, int varsta, int salariu, int vechime, int aniExperienta, int nivelIndemanare) {
        super(nume, prenume, gen, varsta, salariu, vechime);
        this.aniExperienta = aniExperienta;
        this.nivelIndemanare = nivelIndemanare;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    public int getNivelIndemanare() {
        return nivelIndemanare;
    }

    public void setNivelIndemanare(int nivelIndemanare) {
        this.nivelIndemanare = nivelIndemanare;
    }
}
