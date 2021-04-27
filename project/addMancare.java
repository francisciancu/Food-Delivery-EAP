package project;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class addMancare {
    private static addMancare aM;
    private addMancare(){

    }
    public static addMancare getMancare(){
        if (aM == null){
            aM= new addMancare();
        }
        return aM;
    }
    public void mancareAdd(String den , int dif){
        try{
            FileWriter fw = new FileWriter("Mancare.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n");
            bw.write(den +"," + dif + "," + java.time.LocalDateTime.now());
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
