package project;
import java.util.ArrayList;
import java.util.Vector;

public class Services {
    private Services() {
    }

    //MANCARE
    private static Vector<Mancare> mancare = fileReader.readMancare();
    public static Vector<Mancare> getMancare() {
        return mancare;
    }
    public static void adaugaMancare(int dificultate, String nume){
        mancare.add(new Mancare(dificultate, nume));
    }

    //BUCATAR
    private static Vector<Bucatar> bucatar = fileReader.readBucatar();
    public static Vector<Bucatar> getBucatar() {
        return bucatar;
    }
    public static void adaugaBucatar(String nume, String prenume, String gen, int varsta, int salariu, int vechime, int aniExperienta, int nivelIndemanare ){
        bucatar.add(new Bucatar(nume, prenume, gen, varsta, salariu, vechime, aniExperienta, nivelIndemanare));
    }

    //SOFER
    private static Vector<Sofer> sofer = new Vector<Sofer>();
    public static Vector<Sofer> getSofer(){ return sofer;}
    public static void adaugaSofer(String nume, String prenume, String gen, int varsta, int salariu, int vechime, String vehicul, int experienta, boolean inCursa){
        sofer.add(new Sofer(nume, prenume, gen, varsta, salariu, vechime,vehicul,experienta,inCursa));
    }

    //CLIENT
    private static Vector<Client> client = new Vector<Client>();
    public static Vector<Client> getClient() { return client; }
    public static void adaugaClient (String nume, String prenume, String gen, int varsta, boolean inAsteptare, int nrComanda){
        client.add(new Client(nume, prenume, gen, varsta,inAsteptare,nrComanda));
    }

    //LOCAL
    private static Vector<Local> local = fileReader.readLocal();
    public static Vector<Local> getLocal() { return local; }
    public static void adaugaLocal (boolean livreazaDrumuriStricate, boolean livreazaLocalitatiPericuloase, String nume, String adresa, int nrAngajati, int nrClienti, float stele, int nrMinimPopulatie){
        local.add(new Local(livreazaDrumuriStricate,livreazaLocalitatiPericuloase,nume,adresa,nrAngajati,nrClienti,stele,nrMinimPopulatie));
    }

    //LOCALITATE
    private static Vector<Localitate> localitate = new Vector<Localitate>();
    public static Vector<Localitate> getLocalitate() { return localitate; }
    public static void adaugaLocalitate (String denumire,int nrLocuitori, boolean drumuriBune, boolean periculoasa){
        localitate.add(new Localitate(denumire,nrLocuitori,drumuriBune,periculoasa));
    }

    //COMANDA
    private static Vector<Comanda> comanda = fileReader.readComanda();
    public static Vector<Comanda> getComanda() { return comanda; }
    public static void adaugaComanda (int nrComanda, float timpPreparare, int nrProduse){
        comanda.add(new Comanda(nrComanda, timpPreparare, nrProduse));
    }
}
