/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerAcctpack.Model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class MyIconImage {
    public Image getIconImage(){
         ImageIcon LogoImage2 = new ImageIcon(getClass().getResource("/customerAcctpack/imgFol/zt.gif"));
         
         return LogoImage2.getImage();
    }
}
