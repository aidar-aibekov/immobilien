package DB2Project;

import java.sql.*;
import java.util.ArrayList;

public class Connect {

    private ArrayList<Haus> hauser;
    private  ArrayList<Besitzer> besitzers;


    public Connect(){
        hauser = new ArrayList<Haus>();
        besitzers = new ArrayList<Besitzer>();
    }

    public void addWerte(String name, String telefonnummer){
        Connection conn1 = null;
        Statement stmt1 = null;
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
            System.out.println("Creating statement...");
            stmt1 = conn1.createStatement();

            String sql = "insert into Besitzer (name, telefonnummer) " +
                    "values ('"+name+"',"+" '"+telefonnummer+"')";
            stmt1.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

            ResultSet rs = stmt1.executeQuery("select * from Besitzer");

            while (rs.next()) {

                besitzers.add(new Besitzer(rs.getString("name"),
                        rs.getString("telefonnummer")));

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }

    }
    public void connect( ) {
        Connection conn1 = null;
        Statement stmt1 = null;
        Connection conn2 = null;
        Statement stmt2 = null;
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
            System.out.println("Creating statement...");
            stmt1 = conn1.createStatement();

            ResultSet rs = stmt1.executeQuery("select * from Haus");

            while (rs.next()) {

                hauser.add(new Haus(rs.getString("address"),
                        rs.getInt("schaetzung"),
                        rs.getInt("preis"),
                        rs.getInt("besitzer_id")));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }

        try {
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Open a connection
            System.out.println("Connecting to a selected database...");
            conn1 = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //Execute a query
            System.out.println("Creating statement...");
            stmt1 = conn1.createStatement();

            ResultSet rs = stmt1.executeQuery("select * from Besitzer");

            while (rs.next()) {

                besitzers.add(new Besitzer(rs.getString("name"),
                                            rs.getString("telefonnummer")));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }
    }



    public void printHaus() {
        System.out.println();
        for (Haus haus: hauser) {
            System.out.println(haus.getAddress() + "  " + haus.getPreis());
            System.out.println();
        }
        System.out.println();
    }

    public void printBesitzer() {
        System.out.println();
        for (int i=0; i<besitzers.size(); i++) {
            System.out.println(besitzers.get(i).getName()
                    + "  " + besitzers.get(i).getTelefonnummer());
            System.out.println();
        }
        System.out.println();
    }

    public void printAll(){
        for (Haus haus: hauser) {
            for (Besitzer besitzer: besitzers) {
                if (haus.getId_haus()==besitzer.getId_besitzer()){
                    System.out.println(haus.getId_haus() + "  "+ haus.getAddress() +
                                         "  "+ besitzer.getName());
                }

            }

        }
    }


}
