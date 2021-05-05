package project;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class actionTracker {
    private static actionTracker aT;
    private actionTracker(){

    }
    public static actionTracker getAction(){
        if (aT == null){
            aT= new actionTracker();
        }
        return aT;
    }
    int i=0;
    public void trackAction(String Actiune) {
        try{
            FileWriter fw = new FileWriter("src/project/Logs.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n");
            bw.write(i++ +","+ Actiune +","+ java.time.LocalDateTime.now());
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
