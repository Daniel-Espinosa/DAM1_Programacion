
public class Split_Matches {

    public static void main(String[] args) {
        
        String cadenaSplit = "HOLA PARALELO PATATAS QUE LA FUERZA TE ACOMPAÑE";
        String cadenaMatc = "12345678A";
        
        //esto devuelve true si es correcto impreso por pantlla * + ?
        cadenaMatc.matches("[0-9]{8}[A-Z]");
        System.out.println(cadenaMatc.matches("[0-9]{8}[A-Z]"));
        
        cadenaMatc = "123-asd";
        cadenaMatc.matches("[0-9]{3}-[a-z]{3}");
        System.out.println(cadenaMatc.matches("[0-9]{3}-[a-z]{3}"));
        
        //cadena split lo almacena en un array por cada palabra.
        String[] arraySplit = cadenaSplit.split(" ");
        for (String i : arraySplit) {
            System.out.println(i);
        }
        
        
    }
    
}
