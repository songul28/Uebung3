/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u3;

import karadeniz_u3.Liste;
/**
 *
 * @author SoNGuL
 */
public class Aufruf {

    public static void main(String[] args) {

        Car bmw = new Car((short) 4, (short) 4, Vehicle.color.Silber, (short) 220, (short) 5);
        Car audi = new Car((short) 8, (short) 4, Vehicle.color.Black, (short) 180, (short) 5);
        Boat titanic = new Boat((double) 10.54, (short) 3, (double) 100.000, (short) 0, Vehicle.color.Blue, (short) 51000, (short) 0);

        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());

        //Aufgabe 2
        Benennbar namedCar = new Car((short) 4, (short) 4, Vehicle.color.Red, (short) 100, (short) 5);
        namedCar.setName("Name1 xy");
        System.out.println(namedCar.getName());

        //Aufgabe 3
        namedCar.setName("Name2 xx");
        System.out.println(namedCar.getName());

        //Aufgabe 4
        //nimmt 3 elemente maximal auf, falls 2 dann nimmt er nur die erseten 2 elemente 
        //also 200.0 wird nicht aufgenommen, d.h. array ist voll!
      /* Liste array = new Liste(3); 
        array.save(2.0); 
        array.save(5.0); 
        array.save(200);
        
        //ausgabe
        for(int i =0; i< array.getSize(); i++){
            System.out.println(array.getXxx()[i]);
        }
        */  
        
        //Aufgabe 5
        Liste vehicleArray = new Liste(2);  
       
        vehicleArray.save(audi); 
        vehicleArray.save(bmw); 
        vehicleArray.save(titanic);
          
        //ausgabe
         //gibt nur audi und bmw aus, 
        //da nur 2 elemente bei param festgelegt wurde und 3. element hiesst array ist voll.
        for (int i =0; i< vehicleArray.getSize(); i++){
            System.out.println(vehicleArray.getXxx()[i]);
        }
    }
}
