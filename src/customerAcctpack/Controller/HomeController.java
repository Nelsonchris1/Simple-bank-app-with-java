
package customerAcctpack.Controller;

import customerAcctpack.view.Home;
import customerAcctpack.view.LoginPage;


public class HomeController { 
    
    public static void viewHome(){
        
        Home home = new Home();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
       
    }
    public static void viewLoginPage(){
         LoginPage lp = new LoginPage();
         lp.setVisible(true);
         lp.setLocationRelativeTo(null);
    }
    
}
