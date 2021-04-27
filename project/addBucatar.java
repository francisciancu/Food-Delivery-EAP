package project;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class addBucatar {
    private static addBucatar aB;
    private  addBucatar(){

    }

    public static addBucatar getBucatar(){
        if(aB == null){
            aB = new addBucatar();
        }
        return aB;
    }
    public void bucatarAdd(String numeB, String prenB, String G, int V, int VH, int aXP, int nIND){
        try{
            FileWriter fw = new FileWriter("Bucatari.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n");
            bw.write(numeB +"," + prenB + "," +G + "," + V + "," + VH + "," + aXP + "," + nIND);
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
