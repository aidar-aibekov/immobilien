package DB2Project;

public class main {


    public static void main(String[] args) {
        Connect conn = new Connect();
        //conn.connect();
        conn.addWerte("Islam", "24234343");
        /*conn.printAll();
        conn.printHaus();*/
        conn.printBesitzer();
    }
}
