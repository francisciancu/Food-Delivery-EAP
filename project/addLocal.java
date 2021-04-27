package project;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class addLocal {
    private static addLocal aL;

    private addLocal() {

    }

    public static addLocal getLocal() {
        if (aL == null) {
            aL = new addLocal();
        }
        return aL;
    }

    public void localAdd(String nLoc, String adr, int nrAng, int nrCl, int nrMinPop, float stele, boolean livDB, boolean livPer) {
        try {
            FileWriter fw = new FileWriter("Local.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n");
            bw.write(nLoc + "," + adr + "," + nrAng + "," + nrCl + "," + nrMinPop + "," + stele + ",");
            if (livDB) {
                bw.write("Da" + ",");
            } else {
                bw.write("Nu" + ",");
            }
            if (livPer) {
                bw.write("Da");
            } else {
                bw.write("Nu");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
