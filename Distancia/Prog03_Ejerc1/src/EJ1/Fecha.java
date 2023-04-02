/*
*/
package EJ1;


public class Fecha {
    
    private int dia,anio;
    public enum enumMes{
        Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre;
   
        /*
        1("Enero"),
        2("Febrero"),
        3("Marzo"),
        4("Abril"),
        5("Mayo"),
        6("Junio"),
        7("Julio"),
        8("Agosto""),
        9("Septiembre"),
        10("Octubre"),
        11("Noviembre"),
        12("Diciembre");
        */    
    }
    
    
    public Fecha(enumMes mes){
    
        this.enumMes = mes;
        dia=0;
        anio=0;
        
    }

    public Fecha(int dia,enumMes mes, int anio) {
        this.dia = dia;
        this.enumMes = mes;
        this.anio = anio;
        
    }

    
    
    public int getDia() {
        return dia;
    }

    public int getAnio() {
        return anio;
    }

    public int getEnumMes() {
        return enumMes;
    }

    
    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setEnumMes(int enumMes) {
        this.enumMes = enumMes;
    }
    
    
    public boolean esVerano(){
        if (enumMes >5 && enumMes <10) {
            return true;
        } else {
            return false;
        }
        
        
    }
    
    public String toString(){
        return dia+" de "+enumMes+" de "+anio;
        
    }
    
    
}
