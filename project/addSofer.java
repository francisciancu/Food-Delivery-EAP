package project;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class addSofer {
    private static addSofer aS;
    private addSofer(){

    }
    public static addSofer getSofer(){
        if(aS == null){
            aS = new addSofer();
        }
        return aS;
    }
    public void soferAdd(String numSof, String prenSof, String genSof, int varSof, int vecSof, String vehicul, int aniExp, boolean inCursa){
        try{
            FileWriter fw = new FileWriter("Sofer.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n");
            bw.write(numSof +"," + prenSof + "," + genSof + "," + varSof + "," + vecSof + "," + vehicul + "," + aniExp + ",");
            if(inCursa){
                bw.write("Da");
            }else{
                bw.write("Nu");
            }
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
