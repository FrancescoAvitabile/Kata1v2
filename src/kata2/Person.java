/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    
    private final String name;
    private final Calendar birthday;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 356.25);
    
    public Person(String name , Calendar birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    
    public int getAge(){
        
        
        return (int) (milsToYear(GregorianCalendar.getInstance().getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
   private long milsToYear(long milles){
       return milles/MILLISECONDS_PER_YEAR;
   }
    
    
    
    
}
