
package javaapplication1;

import java.util.Date;


public class JavaApplication1 {

    public static void main(String[] args) {
        
        Student htur = new Student("Ruth", new Date(92, 4, 31));
        System.out.println(htur.getAge());
        System.out.println(htur.getBirth());
        System.out.println(htur.getName());
        
        
    }
}
