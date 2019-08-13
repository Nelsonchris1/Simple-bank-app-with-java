
package customerAcctpack.Controller;

import customerAcctpack.view.EntryForm;


public class EntryFormController {
    
    public static void viewEntryForm(){
       EntryForm ef = new EntryForm();
       ef.setVisible(true);
       ef.setLocationRelativeTo(null);
       
    }
}
