/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u3;

/**
 *
 * @author SoNGuL
 */
public class Liste <G extends BenennbarAbstract>{

   
    private Object[] xxx; //leere array mit Datentyp Object, es ist nicht befüllt, variablename xxx
    private int size; //größe des Arrays
    private int index = 0; //index beginnt mit 0
    
    public Liste(int size){ //Parameter
        this.size = size;
        xxx = new Object[this.size]; //erzeugt neue Array Object dessen länge durch size bestimmt wird 
    }                                // und weiss ich dem XXX zu
    
    //Methode save param
    public void save (G param){ //Parameter param weisst du den unbestimmten Datentyp G zu!! G ist ein unbekannter Datentyp
        if (index<size){        // wenn index kleiner als size ist
            xxx[index]= param;  // param weiss ich meine Array index zu
            index++;            // indexzähler um 1 erhöhen
        }
        else{ //falls görßer oder gleich size ist, ist Array voll
            System.out.println("Array ist voll");
        } 
    }
    
    
    //getter setter methoden
    public Object[] getXxx() {
        return xxx;
    }

    public void setXxx(Object[] xxx) {
        this.xxx = xxx;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
   }