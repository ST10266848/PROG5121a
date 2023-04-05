/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lecture10_bills;
import javax.swing.*;    //the star means that everything from that libary can be imported, 
                         //not just JOptionPane but we are using the JOptionpane in this case


public class Lecture10_Bills {

    
    
    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Enter the customer's name");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the minutes talked"));
         double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per minute"));
         
        //parse comnbverts it to a double
        
        
       //sends variables to constructor in the bills class
       bills b = new bills(strName, dblMinutesTalked, dblCostPerMinute);
       
       JOptionPane.showMessageDialog(null, "CUSTOMER NAME: " + 
             b.getName().toUpperCase() + "\n" +
       "Total Due: R " + b.getTotalBills());
        
    }
}
