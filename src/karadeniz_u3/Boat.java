/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u3;

/**
 *
 * @author SoNGuL
 */
public class Boat extends Vehicle {

    private double draft;
    private short propeller;
    private double cargo;

    public Boat(double draft, short propeller, double cargo, short wheels, color farbe, short ps, short doors) {
        super(wheels, farbe, ps, doors);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }

  

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public double getDraft() {
        return draft;
    }

    public short getPropeller() {
        return propeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void unload() throws InterruptedException {
        cargo = 0;
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + super.getPs() + " und einen Tiefgang von " + draft + " m";
    }
    
    
}


