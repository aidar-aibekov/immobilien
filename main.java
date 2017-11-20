package DB2Project;

import java.sql.SQLException;

public class main {


    public static void main(String[] args) throws SQLException {
        Connect conn = new Connect();
        conn.unbedingtRufen();
        conn.printHausBesitzer();
    }
}
