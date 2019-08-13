
package customerAcctpack.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
    
    public static Connection getDataConnection() throws SQLException{
        
        return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=ABCBankDB","sa","blessing123456");
       
    }
}
