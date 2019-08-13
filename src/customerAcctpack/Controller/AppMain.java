/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerAcctpack.Controller;

import javax.swing.UIManager;

public class AppMain {

   
    public static void main(String[] args) {
        
        try{ 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        }catch(Exception e){
            System.out.println("Error in setting WLAF" +e);
        }
        HomeController.viewHome();
    }
    
}
