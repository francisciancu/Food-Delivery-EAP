package project;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class addLocalitate {
    private static addLocalitate aLoc;
    private addLocalitate(){

    }
    public static addLocalitate getLocalitate(){
        if(aLoc == null){
            aLoc = new addLocalitate();
        }
        return aLoc;
    }
    public void localitateAdd(String nume, int loc,boolean dBune, boolean per){
        try{
            FileWriter fw = new FileWriter("Localitate.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n");
            bw.write(nume +"," + loc + "," );
            if(dBune) {
                bw.write("Bune" + ",");
            }else{
                bw.write("Rele" + ",");
            }
            if(per){
                bw.write("Persiculoasa" + ",");
            }else{
                bw.write("Nepericuloasa");
            }
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
