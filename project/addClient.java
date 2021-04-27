package project;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class addClient {
    private static addClient aC;
    private addClient(){

    }
    public static addClient getClient(){
        if(aC == null){
            aC= new addClient();
        }
        return aC;
    }
    public void clientAdd(String numCl, String prenCl, String genCl, int varsta, boolean ast, int nrComCl){
        try{
            FileWriter fw = new FileWriter("Clienti.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n");
            bw.write(numCl +"," + prenCl + "," + genCl + "," + varsta + ",");
            if(ast){
                bw.write("Da" + ",");
            }else{
                bw.write("Nu" + ",");
            }
            bw.write(nrComCl + ",");
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
