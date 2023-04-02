package Calculadora;

public class MetodosCalculadora {

    static public String multiplicar(String v1, String v2) throws NumberFormatException {
        try {
            double n1 = Double.parseDouble(v1);
            double n2 = Double.parseDouble(v2);
            double resultado = n1 * n2;

            return String.valueOf(resultado);

        } catch (NumberFormatException nfe) {
            throw nfe;
        }
        
        
    }
    
     static public String dividir(String v1, String v2) throws NumberFormatException {
        try {
            
            
            
            
        } catch (Exception e) {
        }
        
        return "as";
    }
    
    
    
}
