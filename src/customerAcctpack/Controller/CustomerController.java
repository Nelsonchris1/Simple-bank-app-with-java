
package customerAcctpack.Controller;

import customerAcctpack.Database.Database;
import customerAcctpack.Model.Customer;
import customerAcctpack.Model.Transaction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomerController {
    
    public static boolean isRegister(Customer newCustomer){
    
         boolean isRegOk = false;
          try(
                Connection con = Database.getDataConnection();
                  PreparedStatement prs = con.prepareStatement("insert into customersAcct(vCusName,vCusSurname,cSex,vAddress,cphoneNo,mBal,offficersid) values(?,?,?,?,?,?,?)");
                  
               ){
              prs.setString(1, newCustomer.getName());
              prs.setString(2, newCustomer.getSurname());
              prs.setString(3, newCustomer.getGender());
              prs.setString(4, newCustomer.getHomeAddress());
              prs.setString(5, newCustomer.getPhoneNumber());
              prs.setDouble(6, newCustomer.getBalance());
              prs.setString(7, newCustomer.getStaffid());
              
              int rowsAffected = prs.executeUpdate();
              if(rowsAffected > 0){
                  isRegOk = true;
                  
                  
                  
              }
          }
          catch(SQLException sql)
          {
              System.out.println(sql.getMessage());
          }
         return isRegOk;
    }
    
    public static Customer checkAccountBal(int newAccountNo){
        Customer cust = null;
        try(
                Connection con = Database.getDataConnection();
                PreparedStatement prs = con.prepareStatement("select * from customersAcct where iAcNo = ?");
                ){
            prs.setInt(1, newAccountNo);
            ResultSet rs = prs.executeQuery();
            
            rs.next();
            
            cust = new Customer();
            cust.setAccountNo(rs.getInt("iAcNo"));
            cust.setName(rs.getString("vCusName"));
            cust.setSurname(rs.getString("vCusSurname"));
            cust.setBalance(rs.getDouble("mBal"));
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        
        }
        return cust;
      }
    public static boolean Transaction(Transaction newTransaction){
           boolean istransOk = false;
           try(
                   Connection con = Database.getDataConnection();
                   PreparedStatement prs = con.prepareStatement("insert into transactions(accno,amount,amInWords,TransType) values(?,?,?,?)");
                   
                   ){
               
               prs.setInt(1, newTransaction.getAcctNo());
              prs.setDouble(2, newTransaction.getAmount());
              prs.setString(3, newTransaction.getAmountInwords());
              prs.setString(4, newTransaction.getTransType());
              
              int rows = prs.executeUpdate();
              if(rows > 0 ){
                istransOk = true;
              }
               
           
           }
           catch(SQLException s){
               System.out.println(s.getMessage());
           }
           return istransOk;
    
    }
        
    }

