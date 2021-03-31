package project;

public class Angajat extends Persoana {

    protected int salariu;
    protected int vechime;

    public Angajat(String nume, String prenume, String gen, int varsta, int salariu, int vechime) {
        super(nume, prenume, gen, varsta);
        this.salariu = salariu;
        this.vechime = vechime;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }
}
