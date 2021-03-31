package project;

public class Comanda {
    private int nrComanda;
    private float timpPreparare;
    private int nrProduse;

    public Comanda(int nrComanda, float timpPreparare, int nrProduse) {
        this.nrComanda = nrComanda;
        this.timpPreparare = timpPreparare;
        this.nrProduse = nrProduse;
    }

    public int getNrComanda() {
        return nrComanda;
    }

    public void setNrComanda(int nrComanda) {
        this.nrComanda = nrComanda;
    }

    public float getTimpPreparare() {
        return timpPreparare;
    }

    public void setTimpPreparare(float timpPreparare) {
        this.timpPreparare = timpPreparare;
    }

    public int getNrProduse() {
        return nrProduse;
    }

    public void setNrProduse(int nrProduse) {
        this.nrProduse = nrProduse;
    }
}
