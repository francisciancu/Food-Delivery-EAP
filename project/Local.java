package project;

public class Local {
    private boolean livreazaDrumuriStricate;
    private boolean livreazaLocalitatiPericuloase;
    private String nume;
    private String adresa;
    private int nrAngajati;
    private int nrClienti;
    private float stele;
    private int nrMinimPopulatie;

    public Local(boolean livreazaDrumuriStricate, boolean livreazaLocalitatiPericuloase, String nume, String adresa, int nrAngajati, int nrClienti, float stele, int nrMinimPopulatie) {
        this.livreazaDrumuriStricate = livreazaDrumuriStricate;
        this.livreazaLocalitatiPericuloase = livreazaLocalitatiPericuloase;
        this.nume = nume;
        this.adresa = adresa;
        this.nrAngajati = nrAngajati;
        this.nrClienti = nrClienti;
        this.stele = stele;
        this.nrMinimPopulatie = nrMinimPopulatie;
    }

    public boolean isLivreazaDrumuriStricate() {
        return livreazaDrumuriStricate;
    }

    public void setLivreazaDrumuriStricate(boolean livreazaDrumuriStricate) {
        this.livreazaDrumuriStricate = livreazaDrumuriStricate;
    }

    public boolean isLivreazaLocalitatiPericuloase() {
        return livreazaLocalitatiPericuloase;
    }

    public void setLivreazaLocalitatiPericuloase(boolean livreazaLocalitatiPericuloase) {
        this.livreazaLocalitatiPericuloase = livreazaLocalitatiPericuloase;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public int getNrClienti() {
        return nrClienti;
    }

    public void setNrClienti(int nrClienti) {
        this.nrClienti = nrClienti;
    }

    public float getStele() {
        return stele;
    }

    public void setStele(float stele) {
        this.stele = stele;
    }

    public int getNrMinimPopulatie() {
        return nrMinimPopulatie;
    }

    public void setNrMinimPopulatie(int nrMinimPopulatie) {
        this.nrMinimPopulatie = nrMinimPopulatie;
    }
}
