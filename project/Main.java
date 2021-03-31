package project;

//import java.util.*;
//import java.util.Collections;
//import java.util.Vector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Doriti sa adaugati mancare? -> 1");
            System.out.println("Doriti sa afisati toate mancarurile ? -> 2");
            System.out.println("Doriti sa adaugati o localitate ? -> 3");
            System.out.println("Doriti sa afisati toate localitatile ? -> 4");
            System.out.println("Doriti sa adaugati un local ? -> 5");
            System.out.println("Doriti sa afisati toate localurile ? -> 6");
            System.out.println("Doriti sa adaugati o comanda ? -> 7");
            System.out.println("Doriti sa afisati toate comenzile ? -> 8");
            System.out.println("Doriti sa adaugati un client ? -> 9");
            System.out.println("Doriti sa afisati toti client ? -> 10");
            System.out.println("Doriti sa adaugati un sofer ? -> 11");
            System.out.println("Doriti sa afisati toti soferi ? -> 12");
            System.out.println("Doriti sa adaugati un bucatar ? -> 13");
            System.out.println("Doriti sa afisati toti bucatari ? -> 14");
            System.out.println("Doriti sa inchideti programul ? -> 15");
            System.out.println("Introduceti raspunsul :");
            choice = Integer.parseInt(scanner.nextLine());
            int actiune;
            if (choice == 1) {
                do {
                    actiune = 1;
                    System.out.println("Numele mancari :");
                    String den = scanner.nextLine();
                    System.out.println("Nivelul de dificultate : ");
                    int dif = Integer.parseInt(scanner.nextLine());
                    Services.adaugaMancare(dif, den);
                    System.out.println("Doriti sa mai adaugati mancare ? ");
                    System.out.println("1 -> DA");
                    System.out.println("2 -> NU");
                    int ans = Integer.parseInt(scanner.nextLine());
                    if (ans == 2) {
                        actiune = 0;
                    }
                } while (actiune == 1);
            }

            else if (choice == 2) {
                Services.getMancare().forEach((iteraror) -> {
                    System.out.println("Denumire mancare : " + iteraror.getDenumire());
                    System.out.println("Dificultate mancare : " + iteraror.getDificultate());
                });
            }

            else if (choice == 3) {
                do {
                    actiune = 1;
                    System.out.println("Introduceti numele localitatii : ");
                    String nume = scanner.nextLine();
                    System.out.println("Introduceti numarul de locuitori din localitate : ");
                    int loc = Integer.parseInt(scanner.nextLine());
                    System.out.println("Localitatea are drumuri bune ? ");
                    System.out.println("1 -> DA");
                    System.out.println("0 -> NU");
                    int bool = Integer.parseInt(scanner.nextLine());
                    boolean dBune;
                    dBune = bool == 1;
                    System.out.println("Localitatea este periculoasa ? ");
                    System.out.println("1 -> DA");
                    System.out.println("0 -> NU");
                    int bool1 = Integer.parseInt(scanner.nextLine());
                    boolean per;
                    per = bool1 == 1;
                    Services.adaugaLocalitate(nume, loc, dBune, per);
                    System.out.println("Localitatea a fost adaugata ! ");
                    System.out.println("Doriti sa mai adaugati o localitate ? ");
                    System.out.println("1 -> DA");
                    System.out.println("2 -> NU");
                    int ans = Integer.parseInt(scanner.nextLine());
                    if (ans == 2) {
                        actiune = 0;
                    }
                } while (actiune == 1);
            } else if (choice == 4) {
                Services.getLocalitate().forEach((iteraror) -> {
                    System.out.println("Numele localitati : " + iteraror.getDenumire());
                    System.out.println(" Numar de locuitori : " + iteraror.getNrLocuitori());
                    if (iteraror.isDrumuriBune()) {
                        System.out.println("Localitatea are drumuri bune ! ");
                    } else {
                        System.out.println("Localitatea nu are drumuri bune ! ");
                    }
                    if (iteraror.isPericuloasa()) {
                        System.out.println("Localitatea este periculoasa ! ");
                    } else {
                        System.out.println("Localitatea nu este periculoasa ! ");
                    }
                });
            } else if (choice == 5) {
                do {
                    actiune = 1;
                    System.out.println("Numele localului : ");
                    String nLoc = scanner.nextLine();
                    System.out.println("Adresa localului : ");
                    String adr = scanner.nextLine();
                    System.out.println("Numar de angajati : ");
                    int nrAng = Integer.parseInt(scanner.nextLine());
                    System.out.println("Numar de clienti : ");
                    int nrCl = Integer.parseInt(scanner.nextLine());
                    System.out.println("Populatie minima pentru livrari : ");
                    int nrMinPop = Integer.parseInt(scanner.nextLine());
                    System.out.println("Numar stele ( 0 -> 5 ) : ");
                    float stele = Float.parseFloat(scanner.nextLine());
                    System.out.println("Livreaza in zone care nu au drumuri bune : ");
                    System.out.println("1 -> DA");
                    System.out.println("0 -> NU");
                    boolean livDB;
                    int bool = Integer.parseInt(scanner.nextLine());
                    livDB = bool == 1;
                    System.out.println("Livreaza in localitati periculoase : ");
                    System.out.println("1 -> DA");
                    System.out.println("0 -> NU");
                    int bool1 = Integer.parseInt(scanner.nextLine());
                    boolean livPer;
                    livPer = bool1 == 1;
                    Services.adaugaLocal(livDB, livPer, nLoc, adr, nrAng, nrCl, stele, nrMinPop);
                    System.out.println("Localul a fost adaugat ! ");
                    System.out.println("Doriti sa mai adaugati un local ? ");
                    System.out.println("1 -> DA");
                    System.out.println("2 -> NU");
                    int ans = Integer.parseInt(scanner.nextLine());
                    if (ans == 2) {
                        actiune = 0;
                    }

                } while (actiune == 1);
            } else if (choice == 6) {
                Services.getLocal().forEach((iteraror) -> {
                    System.out.println("Nume local : " + iteraror.getNume());
                    System.out.println("Adresa localului : " + iteraror.getAdresa());
                    System.out.println("Stele : " + iteraror.getStele());
                    if (iteraror.isLivreazaDrumuriStricate()) {
                        System.out.println("Localul livreaza in localitati cu drumuri stricate ! ");
                    } else {
                        System.out.println("Localul nu livreaza in localitati cu drumuri stricate ! ");
                    }
                    if (iteraror.isLivreazaLocalitatiPericuloase()) {
                        System.out.println("Localul livreaza in localitati periculoase !");
                    } else {
                        System.out.println("Localul nu livreaza in localitati periculoase !");
                    }
                });
            } else if (choice == 7) {
                do {
                    actiune = 1;
                    System.out.println("Numarul comenzi : ");
                    int nrCom = Integer.parseInt(scanner.nextLine());
                    System.out.println("Timpul de preparare este ( in minute ) : ");
                    int timpPrep = Integer.parseInt(scanner.nextLine());
                    System.out.println("Numarul de produse : ");
                    int nrProd = Integer.parseInt(scanner.nextLine());
                    Services.adaugaComanda(nrCom, timpPrep, nrProd);
                    System.out.println("Comanda a fost adaugata !");
                    System.out.println("Doriti sa mai adaugati o comanda ? ");
                    System.out.println("1 -> DA");
                    System.out.println("2 -> NU");
                    int ans = Integer.parseInt(scanner.nextLine());
                    if (ans == 2) {
                        actiune = 0;
                    }

                } while (actiune == 1);
            } else if (choice == 8) {
                Services.getComanda().forEach((iteraror) -> {
                    System.out.println("Numarul comenzi este : " + iteraror.getNrComanda());
                    System.out.println("Timpul de preparare al comenzi este ( in minute ) : " + iteraror.getTimpPreparare());
                    System.out.println("Numarul de produse din comanda este de : " + iteraror.getNrProduse());
                });
            } else if (choice == 9) {
                do {
                    actiune = 1;
                    System.out.println("Numele clientului : ");
                    String numCl = scanner.nextLine();
                    System.out.println("Prenumele clientului : ");
                    String prenCl = scanner.nextLine();
                    System.out.println("Varsta clientului : ");
                    int varsta = Integer.parseInt(scanner.nextLine());
                    System.out.println("Genul clientului : ");
                    System.out.println("Masculin");
                    System.out.println("Feminin");
                    String genCl = scanner.nextLine();
                    System.out.println("Clientul este in asteptare ? ");
                    System.out.println("1 -> DA");
                    System.out.println("0 -> NU");
                    int bool1 = Integer.parseInt(scanner.nextLine());
                    boolean ast;
                    ast = bool1 == 1;
                    System.out.println("Numar comanda : ");
                    int nrComCl = Integer.parseInt(scanner.nextLine());
                    Services.adaugaClient(numCl, prenCl, genCl, varsta, ast, nrComCl);
                    System.out.println("Clientul a fost adaugat !");
                    System.out.println("Doriti sa mai adaugati un client ? ");
                    System.out.println("1 -> DA");
                    System.out.println("2 -> NU");
                    int ans = Integer.parseInt(scanner.nextLine());
                    if (ans == 2) {
                        actiune = 0;
                    }
                } while (actiune == 1);
            } else if (choice == 10) {
                Services.getClient().forEach((iteraror) -> {
                    System.out.println("Numele clientului : " + iteraror.getNume());
                    System.out.println("Prenumele clientului : " + iteraror.getPrenume());
                    System.out.println("Varsta clientului : " + iteraror.getVarsta());
                    System.out.println("Genul clientului : " + iteraror.getGen());
                    System.out.println("Numar comanda : " + iteraror.getNrComanda());
                    if (iteraror.isInAsteptare()) {
                        System.out.println("Clientul isi asteapta comanda ! ");
                    } else {
                        System.out.println("Clientul nu isi astepata comanda ! ");
                    }
                });
            } else if (choice == 11) {
                do {
                    actiune = 1;
                    System.out.println("Numele soferului : ");
                    String numSof = scanner.nextLine();
                    System.out.println("Prenumele soferului : ");
                    String prenSof = scanner.nextLine();
                    System.out.println("Genul soferului : ");
                    System.out.println("Masculin");
                    System.out.println("Feminin");
                    String genSof = scanner.nextLine();
                    System.out.println("Varsta soferului : ");
                    int varSof = Integer.parseInt(scanner.nextLine());
                    System.out.println("Salariul soferului : ");
                    int salSof = Integer.parseInt(scanner.nextLine());
                    System.out.println("Vechimea soferului : ");
                    int vecSof = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ani de experienta ai soferului : ");
                    int aniExp = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ce vehicul conduce soferul ? ");
                    String vehicul = scanner.nextLine();
                    System.out.println("Soferul se afla in cursa ? ");
                    System.out.println("1 -> DA");
                    System.out.println("0 -> NU");
                    int bool0 = Integer.parseInt(scanner.nextLine());
                    boolean inCursa;
                    inCursa = bool0 == 1;
                    Services.adaugaSofer(numSof, prenSof, genSof, varSof, salSof, vecSof, vehicul, aniExp, inCursa);
                    System.out.println("Soferul a fost adaugat ! ");
                    System.out.println("Doriti sa mai adaugati un sofer ? ");
                    System.out.println("1 -> DA");
                    System.out.println("2 -> NU");
                    int ans = Integer.parseInt(scanner.nextLine());
                    if (ans == 2) {
                        actiune = 0;
                    }
                } while (actiune == 1);
            } else if (choice == 12) {
                Services.getSofer().forEach((iteraror) -> {
                    System.out.println("Numele soferului : " + iteraror.getNume());
                    System.out.println("Prenumele soferului : " + iteraror.getPrenume());
                    System.out.println("Genul soferului : " + iteraror.getGen());
                    System.out.println("Varsta soferului : " + iteraror.getVarsta());
                    System.out.println("Salariul soferului : " + iteraror.getSalariu());
                    System.out.println("Vechimea soferului : " + iteraror.getVechime());
                    System.out.println("Ani de experienta ai soferului : " + iteraror.getExperienta());
                    System.out.println("Soferul conduce : " + iteraror.getVehicul());
                    if (iteraror.isInCursa()) {
                        System.out.println("Soferul se afla in cursa ! ");
                    } else {
                        System.out.println("Soferul nu se afla in cursa ! ");
                    }
                });
            } else if (choice == 13) {
                do {
                    actiune = 1;
                    System.out.println("Numele bucatarului :");
                    String numeB = scanner.nextLine();
                    System.out.println("Prenumele bucatarului :");
                    String prenB = scanner.nextLine();
                    System.out.println("Genul bucatarului : ");
                    System.out.println("Masculin");
                    System.out.println("Feminin");
                    String G = scanner.nextLine();
                    System.out.println("Varsta bucatarului :");
                    int V = Integer.parseInt(scanner.nextLine());
                    System.out.println("Salariul bucatarului :");
                    int S = Integer.parseInt(scanner.nextLine());
                    System.out.println("Vechimea bucatarului :");
                    int VH = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ani de experienta ai bucatarului :");
                    int aXP = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nivelul de indemanare al bucatarului ( 1 -> 10 ):");
                    int nIND = Integer.parseInt(scanner.nextLine());
                    Services.adaugaBucatar(numeB, prenB, G, V, S, VH, aXP, nIND);
                    System.out.println("Bucatar adaugat cu succes ! ");
                    System.out.println("Doriti sa mai adaugati bucatari ? ");
                    System.out.println("1 -> DA");
                    System.out.println("2 -> NU");
                    int ans = Integer.parseInt(scanner.nextLine());
                    if (ans == 2) {
                        actiune = 0;
                    }
                } while (actiune == 1);
            } else if (choice == 14) {
                Services.getBucatar().forEach((iteraror) -> {
                    System.out.println("Nume : " + iteraror.getNume());
                    System.out.println("Prenume : " + iteraror.getPrenume());
                    System.out.println("Varsta : " + iteraror.getVarsta());
                    System.out.println("Gen : " + iteraror.getGen());
                    System.out.println("Nivel de indemanare : " + iteraror.getNivelIndemanare());
                });
            }
        } while (choice != 15);
        System.out.println("Programul se inchide ! Multumim !");
    }
}