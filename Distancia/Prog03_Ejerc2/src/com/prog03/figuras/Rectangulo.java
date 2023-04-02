/*


*/
package com.prog03.figuras;


public class Rectangulo {

    //Declaraciones
    private int base, alt;
    
    
    //constructores
    
    public Rectangulo(){
        base=0;
        alt=0;
        
    }
        
    public Rectangulo(int base, int alt){
        this.base = base;
        this.alt = alt;
        
    }
    
    //metodos

    public void setBase(int base) {
        this.base = base;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int getBase() {
        return base;
    }

    public int getAlt() {
        return alt;
    }

    public float getArea(){
        //formula del area
        return base*alt;
    }
    
    public String toString(){
        return "La base es: "+Rectangulo.this.getArea()+" y la altura es: "+alt;
        
    }
           
    public boolean isCuadrado(){
        if (base!=alt) {
            return false;
        } else {
            return true;
        }
    }
    
    
    
    
}
