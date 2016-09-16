/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author LENOVO G500
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2006,5,10);
                
        Person miPerson = new Person("Gino" , date);
        System.out.println(miPerson.getName() + " tiene " + miPerson.getAge() + " anni!");
    }
}
