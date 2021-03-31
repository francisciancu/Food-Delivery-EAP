package project;

public class Client extends Persoana{
    private boolean inAsteptare;
    private int nrComanda;

    public Client(String nume, String prenume, String gen, int varsta, boolean inAsteptare, int nrComanda) {
        super(nume, prenume, gen, varsta);
        this.inAsteptare = inAsteptare;
        this.nrComanda = nrComanda;
    }

    public boolean isInAsteptare() {
        return inAsteptare;
    }

    public void setInAsteptare(boolean inAsteptare) {
        this.inAsteptare = inAsteptare;
    }

    public int getNrComanda() {
        return nrComanda;
    }

    public void setNrComanda(int nrComanda) {
        this.nrComanda = nrComanda;
    }
}
