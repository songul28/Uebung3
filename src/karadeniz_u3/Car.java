/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u3;

/**
 *
 * @author SoNGuL
 */
public class Car extends Vehicle {

    private boolean aircondition;
    private short airbag;

    public Car(short airbag, short wheels, color farbe, short ps, short doors) {
        super(wheels, farbe, ps, doors);
        aircondition = false;
        this.airbag = airbag;
    }


    public boolean isBaircondition() {
        return aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setBaircondition(boolean baircondition) {
        this.aircondition = baircondition;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }

    public void startAircondition() {
        if (aircondition = false) {
            aircondition = true;
        } else {
            System.out.println("Klimaanlage läuft bereits");
        }
    }

    public void stopAircondition() {
        if (aircondition = false) {
            aircondition = false;
        } else {
            System.out.println("Klimaanlage ist bereits aus");
        }
    }

    @Override
    public String toString() {
        return "Mein Auto hat " + super.getPs()+ " PS und fährt mit " + super.getSpeed()+" km/h";


    }
}
