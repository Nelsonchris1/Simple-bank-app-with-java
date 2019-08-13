/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerAcctpack.Controller;

import customerAcctpack.Database.Database;
import customerAcctpack.Model.Users;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class UsersController {
    
    public static boolean isLoginOk(String newUsername, String newPassword){
    
         boolean loginOK = false;
         
         try(
                Connection con = Database.getDataConnection();
                 Statement statement = con.createStatement();
                 ResultSet rs = statement.executeQuery("select * from AccountUsers where cAu = 001");
                 ){
             
                     Users user = new Users();
                     rs.next();
                     String username = rs.getString("cusername");
                     String password = rs.getString("cpassword");
                     user.setUsername(username);
                     user.setPassword(password);
                 
                 if(user.getUsername().trim().equalsIgnoreCase(newUsername) && user.getPassword().trim().equals(newPassword)){
                 loginOK = true;
                 }
             
         }
         catch(SQLException sql){
             System.out.println(sql.getMessage());
         }
         return loginOK;
    }
}
