package project;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class addComanda {
    private static addComanda aCom;
    private addComanda(){

    }
    public static addComanda getComanda(){
        if(aCom == null){
            aCom = new addComanda();
        }
        return aCom;
    }
    public void comandaAdd(int nrCom, int timpPrep, int nrProd){
        try{
            FileWriter fw = new FileWriter("Comenzi.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n");
            bw.write(nrCom +"," + timpPrep + "," + nrProd);
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
