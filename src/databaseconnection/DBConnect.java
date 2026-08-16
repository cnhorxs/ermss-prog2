
package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;








public class DBConnect {
    
    public Connection con;
    private static DBConnect instance;
    
    private DBConnect (){}
    
    public static DBConnect getInstance(){
        if(instance == null){
            instance = new DBConnect();
        }
    return instance;
    }
    
   
    
    
    
    
    
    
    public void ConnectionDB(){
    
    try {
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:ERMSS_database.db");
        System.out.println("Connection Established");
    }
    catch (Exception e) {
        System.out.println("Connecton failed" + e);
    }
   
    }

    
    
    
    
    
    
    
    
    
    
    
    




}
