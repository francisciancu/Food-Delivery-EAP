package project;

public class Localitate {
    private String denumire;
    private int nrLocuitori;
    private boolean drumuriBune;
    private boolean periculoasa;

    public Localitate(String denumire, int nrLocuitori, boolean drumuriBune, boolean periculoasa) {
        this.denumire = denumire;
        this.nrLocuitori = nrLocuitori;
        this.drumuriBune = drumuriBune;
        this.periculoasa = periculoasa;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNrLocuitori() {
        return nrLocuitori;
    }

    public void setNrLocuitori(int nrLocuitori) {
        this.nrLocuitori = nrLocuitori;
    }

    public boolean isDrumuriBune() {
        return drumuriBune;
    }

    public void setDrumuriBune(boolean drumuriBune) {
        this.drumuriBune = drumuriBune;
    }

    public boolean isPericuloasa() {
        return periculoasa;
    }

    public void setPericuloasa(boolean periculoasa) {
        this.periculoasa = periculoasa;
    }
}
