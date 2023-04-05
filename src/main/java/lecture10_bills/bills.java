/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture10_bills;

//in bills, we are declaring two things

public class bills {
    private String strCustomer;
    private double dblMinutes, dblCost;
    
    //constructor that is receiving our variables. Its gonna allow these parameters to pass thru
    //public bills(String strName, double dblMinutes, double dblCostPerMinute, double dblMinutesTalked){
        //strCustomer = strName;
     //dblMinutes = dblMinutesTalked;
     //dblCost = dblCostPerMinute;
     
    //}

    bills(String strName, double dblMinutesTalked, double dblCostPerMinute) {
     strCustomer = strName;
     dblMinutes = dblMinutesTalked;
     dblCost = dblCostPerMinute;
    }
    public String getName(){
           return strCustomer;
    }
    public double getTotalBills(){
          return (dblMinutes * dblCost);
    }
    
}
