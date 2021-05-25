package project;

import java.sql.*;

class MySQL {
    public static class SqlConfig {

        private static Connection connection;
        private static String URL = "jdbc:mysql://127.0.0.1:3306/food_delivery";
        private static String USER = "root";
        private static String PASSWORD = "Parola123";

        public static Connection getDataBaseConnection() {

            try {
                if (connection == null || connection.isClosed()) {
                    connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    System.out.println("Successfully connected to DB");

                }
            } catch (SQLException exception) {
                throw new SqlCustomException("Cannot connect to DB", exception);
            }
            return connection;
        }

        public static void closeDataBaseConnection() {
            try {
                if( connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException exception) {
                throw new SqlCustomException("Cannot close connection to DB", exception);
            }
        }
///Mancare
        public static void select_mancare(){
            try {
                Statement stmt = connection.createStatement();
                ResultSet Rs = stmt.executeQuery("SELECT * from mancare");
                while (Rs.next()){
                    System.out.println("ID: " + Rs.getInt("id_mancare") +" " +"Denumire : " + Rs.getString("denumire") + "  Dificultate: " + Rs.getInt("dificultate") );
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
        public static void insert_mancare(int dificultate , String denumire){
            try {
                Statement stmt = connection.createStatement();
                String sql = "insert into mancare"
                        +"(`dificultate`,`denumire`)"
                        + "values (" + dificultate + ",'" +denumire + "');";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        public static void update_mancare_denumire(int id, String denumire_noua){
            try {
                Statement stmt = connection.createStatement();
                String sql = "update mancare set denumire=" +"'" + denumire_noua + "'" + " where id_mancare=" + id + ";";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        public static void update_mancare_dificultate(int id, int difnoua){
            try {
                Statement stmt = connection.createStatement();
                String sql = "update mancare set dificultate="+ difnoua + " where id_mancare=" + id + ";";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }

        public static void delete_mancare(int id){
            try {
                Statement stmt = connection.createStatement();
                String sql = "delete from mancare where id_mancare=" + id + ";";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        ///Comanda
        public static void select_comanda(){
            try {
            Statement stmt = connection.createStatement();
            ResultSet Rs = stmt.executeQuery("SELECT * from comanda");
            int i=1;
            while (Rs.next()){
                System.out.println("ID: " + Rs.getInt("id_comanda") +" " +"Numar comanda : " + Rs.getInt("numar_comanda") + "  Timp preparare " + Rs.getInt("timp_preparare") + "   Numar produse:  " + Rs.getInt("nr_produse") );
            }
        }catch (Exception e){
            System.out.println(e);
        }
        }

        public static void insert_comanda(int nrcom, int timpprep, int nrprod){
            try {
                Statement stmt = connection.createStatement();
                String sql = "INSERT INTO comanda " +"(`numar_comanda`,`timp_preparare`,`nr_produse`)" + "values (" + nrcom +"," + timpprep + "," + nrprod + ");";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }


        public static void update_nr_produse(int id, int prodnou){
            try {
                Statement stmt = connection.createStatement();
                String sql = "update comanda set nr_produse="+ prodnou + " where id_comanda=" + id + ";";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }

        public static void delete_comanda(int id){
            try {
                Statement stmt = connection.createStatement();
                String sql = "delete from comanda where id_comanda=" + id + ";";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }




        ///Localitate
        public static void select_localitate(){
            try {
                Statement stmt = connection.createStatement();
                ResultSet Rs = stmt.executeQuery("SELECT * from localitate");
                int i=1;
                while (Rs.next()){
                    System.out.println("ID: " + Rs.getInt("id_localitate") +" " +"Denumire: " + Rs.getString("denumire") + "  Numar locuitori: " + Rs.getInt("nr_locuitori") + "   Are drumuri bune:  " + Rs.getBoolean("drumuri_bune") + "   Periculoasa:  " + Rs.getBoolean("periculoasa"));
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }

        public static void insert_localitate(String den, int nrLoc, boolean drumuri_bune, boolean peri){
            try {
                Statement stmt = connection.createStatement();
                String sql ="INSERT INTO localitate (`denumire`,`nr_locuitori`,`drumuri_bune`,`periculoasa`) values ('" + den + "'," + nrLoc + "," + drumuri_bune + "," + peri +");";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }

        public static void update_populatie_localitate(int id, int popnou){
            try {
                Statement stmt = connection.createStatement();
                String sql = "update localitate set nr_locuitori="+ popnou + " where id_localitate=" + id + ";";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }


        public static void delete_localitate(int id){
            try {
                Statement stmt = connection.createStatement();
                String sql = "delete from localitate where id_localitate=" + id + ";";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }


        ///Sofer
        public static void select_sofer(){
            try {
                Statement stmt = connection.createStatement();
                ResultSet Rs = stmt.executeQuery("SELECT * from sofer");
                int i=1;
                while (Rs.next()){
                    System.out.println("ID: " + Rs.getInt("id_sofer") +" " +"Nume: " + Rs.getString("nume") + "   Prenume: "+ Rs.getString("prenume") + "    Gen: " + Rs.getString("gen") + "  Varsta: " + Rs.getInt("varsta")
                    + "  Salariu: " + Rs.getInt("salariu") + "  Vechime: " + Rs.getInt("vechime") + "  Vehicul: " + Rs.getString("vehicul") + "  Experienta: " + Rs.getInt("experienta") + "  In cursa: " + Rs.getBoolean("in_cursa"));
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }

        public static void insert_sofer(String num, String pren, String g, int var, int sal, int vec, String veh, int exp, boolean in_c ){
            try {
                Statement stmt = connection.createStatement();
                String sql = "insert into sofer"
                        +"(`nume``prenume`,`gen`,`varsta`,`salariu`,`vechime`,`vehicul`,`experienta`,`in_cursa`)"
                        + "values ('" + num + "','" + pren + "','" + g + "'," + var + " , " + sal + "," + vec + ",'" + veh + "'," + exp + "," + in_c + ");";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }

        public static void update_sofer_salariu(int id, int salnou){
            try {
                Statement stmt = connection.createStatement();
                String sql = "update sofer set salariu="+ salnou + " where id_sofer=" + id + ";";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        public static void delete_sofer(int id){
            try {
                Statement stmt = connection.createStatement();
                String sql = "delete from sofer where id_sofer=" + id + ";";
                stmt.executeUpdate(sql);
            }catch (Exception e){
                System.out.println(e);
            }
        }



        private SqlConfig() {
        }
    }
}
