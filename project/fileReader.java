package project;

import org.apache.commons.csv.*;

import java.io.FileReader;
import java.io.Reader;
import java.util.Vector;

public class fileReader {
    //Citire Mancare
    public static Vector<Mancare> readMancare() {
        Vector<Mancare> mancare = new Vector<Mancare>();
        try (Reader in = new FileReader("Mancare.csv")) {
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader(new String[]{"Denumire", "Dificultate","Data adaugarii"})
                    .withFirstRecordAsHeader()
                    .parse(in);
            for (CSVRecord element:records) {
                Mancare mancarenoua = new Mancare(Integer.parseInt(element.get("Dificultate")), element.get("Denumire"));
                mancare.add(mancarenoua);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mancare;
    }

    //Citire Comenzi
    public static Vector<Comanda> readComanda(){
        Vector<Comanda> comanda = new Vector<Comanda>();
        try(Reader in = new FileReader("Comenzi.csv")){
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader(new String[]{"Numar Comanda", "Timp Preparare", "Numar Produse", "Data adaugarii"})
                    .withFirstRecordAsHeader()
                    .parse(in);
            for (CSVRecord element:records) {
                Comanda comandanoua = new Comanda(Integer.parseInt(element.get("Numar Comanda")),Float.parseFloat(element.get("Timp Preparare")), Integer.parseInt(element.get("Numar Produse")));
                comanda.add(comandanoua);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return comanda;
    }

    //Citire Bucatar
    public static Vector<Bucatar> readBucatar(){
        Vector<Bucatar> bucatar = new Vector<Bucatar>();
        try(Reader in = new FileReader("Bucatari.csv")){
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader(new String[]{"Nume" , "Prenume" , "Gen" , "Varsta" , "Salariu" , "Vechime" , "Ani de experienta", "Nivel indemanare" ,"Data adaugarii"})
                    .withFirstRecordAsHeader()
                    .parse(in);
            for (CSVRecord element:records) {
                Bucatar bucatarnou = new Bucatar(element.get("Nume"), element.get("Prenume"), element.get("Gen"),Integer.parseInt(element.get("Varsta")), Integer.parseInt(element.get("Salariu")), Integer.parseInt(element.get("Vechime")),Integer.parseInt(element.get("Ani de experienta")),Integer.parseInt(element.get("Nivel de indemanare")));
                bucatar.add(bucatarnou);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return bucatar;
    }
    //Citire Local
    public static Vector<Local> readLocal(){
        Vector<Local> local = new Vector<Local>();
        try(Reader in = new FileReader("Local.csv")){
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader(new String[]{"Livreaza pe drumuri stricate" , "Livreaza in localitati persiculoase" , "Nume" , "Adresa" , "Numar angajati" , "Numar clienti" , "Stele" , "Numar minim de populatie pentru a livra" , "Data adaugarii"})
                    .withFirstRecordAsHeader()
                    .parse(in);
            for (CSVRecord element:records) {
                Local localnou = new Local(Boolean.parseBoolean(element.get("Livreaza pe drumuri stricate")),Boolean.parseBoolean(element.get("Livreaza in localitati persiculoase")), element.get("Nume"), element.get("Adresa"), Integer.parseInt(element.get("Numar angajati")),Integer.parseInt(element.get("Numar clienti")),Float.parseFloat(element.get("Stele")), Integer.parseInt(element.get("Numar minim de populatie pentru a livra")));
                local.add(localnou);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return local;
    }

}