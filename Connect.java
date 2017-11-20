package DB2Project;

import java.sql.*;
import java.util.ArrayList;

public class Connect {

    private ArrayList<Haus> hauser;
    private  ArrayList<Besitzer> besitzers;
    private ArrayList<Kaufinteressanten> kaufinteressantens;
    private ArrayList<Verkauf> verkaufs;


    public Connect(){
        hauser = new ArrayList<Haus>();
        besitzers = new ArrayList<Besitzer>();
        kaufinteressantens = new ArrayList<Kaufinteressanten>();
        verkaufs = new ArrayList<Verkauf>();
    }

    public Connection connect(){
        Connection conn1 = null;
        String DB_URL = "jdbc:mysql://localhost:3306/immobilien";
        String USER = "root";
        String PASS = "123";
        try {
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //Open a connection
            System.out.println("Connecting to a selected database...");
            conn1 = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");
            //Execute a query
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }
        return conn1;
    }

    public Statement statement() throws SQLException {
        System.out.println("Creating statement...");
        Statement statement = connect().createStatement();
        return statement;
    }

    public void addWerteBesitzer(String name, String telefonnummer){
        try {
            String sql = "insert into Besitzer (name, telefonnummer) " +
                    "values ('"+name+"',"+" '"+telefonnummer+"')";
            statement().executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        }  catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }
    }

    public void addWerteHaus(String address, int schaetzung,
                             int preis, int besitzer_id){
        try {
            String sql = "insert into Haus (address, schaetzung, " +
                    "preis, besitzer_id) " +
                    "values ('"+address+"',"+schaetzung+","
                    +preis+","+besitzer_id+")";
            statement().executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        }  catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }
    }

    public void addWerteKaufinter(String name){
        try {
            String sql = "insert into Kaufinteressanten (name)" +
                    "values ('"+name+"')";
            statement().executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        }  catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }
    }

    public void addWerteVerkauf(int haus_id){
        try {
            String sql = "insert into Verkauf (haus_id)" +
                    "values ('"+haus_id+"')";
            statement().executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        }  catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }
    }

    public void unbedingtRufen() throws SQLException {
        ResultSet rs = statement().executeQuery("select * from Haus");
        while (rs.next()) {
            hauser.add(new Haus(rs.getString("address"),
                    rs.getInt("schaetzung"),
                    rs.getInt("preis"),
                    rs.getInt("besitzer_id")));
        }
        rs = statement().executeQuery("select * from Besitzer");
        while (rs.next()) {
            besitzers.add(new Besitzer(rs.getString("name"),
                    rs.getString("telefonnummer")));
        }
        rs = statement().executeQuery("select * from Kaufinteressanten");
        while (rs.next()) {
            kaufinteressantens.add(new Kaufinteressanten(
                    rs.getString("name")));
        }
        rs = statement().executeQuery("select * from Verkauf");
        while (rs.next()) {
            verkaufs.add(new Verkauf(
                    rs.getInt("haus_id")));
        }
    }

    public void printHausBesitzer() {
        for (Besitzer besitzer : besitzers) {
            for (Haus haus : hauser) {
                if (besitzer.getId_besitzer()==haus.getBesitzer_id()) {
                    System.out.println(haus.getAddress() +
                            "  " + haus.getPreis() +
                            " "  + besitzer.getName());
                }
            }
        }
    }
}
