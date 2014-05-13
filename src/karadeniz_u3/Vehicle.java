/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u3;

/**
 *
 * @author SoNGuL
 */
public class Vehicle extends BenennbarAbstract implements Benennbar{

    private short wheels;
    private color farbe;

  
    
    public enum color {

        Black, Silber, Red, Grey, Yellow, Blue
    }
    private short ps;
    private short doors;
    private boolean started;
    private short speed;
    
    //Aufgabe 2
   // private String name;
  //
 //   @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
    
    public Vehicle(short wheels, color farbe, short ps, short doors) {
        this.wheels = wheels;
        this.farbe = farbe;
        this.ps = ps;
        this.doors = doors;
        this.started = false;
        this.speed = 0;
        
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public short getWheels() {
        return wheels;
    }

    public color getFarbe() {
        return farbe;
    }

    public short getPs() {
        return ps;
    }

    public short getDoors() {
        return doors;
    }

    public boolean isStarted() {
        return started;
    }

    public short getSpeed() {
        return speed;
    }


    public void start() {
        started = true;
    }

    public void stop() {
        started = false;
    }

    public void accelerate(short speed) {
        if (started) {
            this.speed += speed;
        }
        if (speed > 250) {
            this.speed = 250;
        }

    }

    public void slow(short speed) {
        if (started) {
            this.speed -= speed;
        }

        if (speed < 0) {
            this.speed = 0;
        }
    }
}
