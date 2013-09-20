
package javaapplication1;

import java.util.Date;


public class Student {
    
    private final static double DAYS_PER_YEAR = 365.25;
    private final static long HOURS_PER_YEAR = (long) (24 * DAYS_PER_YEAR);
    private final static long MINUTES_PER_YEAR = HOURS_PER_YEAR * 60;
    private final static long SECONDS_PER_YEAR = 60 * MINUTES_PER_YEAR;
    private final static long MILLISECONDS_PER_YEAR = 1000 * SECONDS_PER_YEAR;
    
    private String name;
    private Date birth;

    public Student(String name, Date b) {
        this.name = name;
        this.birth = b;
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }
    
    public int getAge(){
        Date today = new Date();
        long milliseconds = today.getTime() - birth.getTime();
        return (int) (milliseconds/MILLISECONDS_PER_YEAR);
    }
    
    
    
  
}
