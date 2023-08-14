
package BMSR14082023Config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
       Connection con;
    public Conexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=crud;integratedSecurity=true;");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}

