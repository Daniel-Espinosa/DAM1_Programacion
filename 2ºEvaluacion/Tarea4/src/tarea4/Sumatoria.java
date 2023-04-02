/*

*/
package tarea4;


//Al menos una herencia entre clases.
public class Sumatoria extends abstracta {
    
    // declaramos variables
    public int sumando1; //atributo1
    public int sumando2; //atributo2
    
    //El constructor por defecto y con parámetros de una clase no abstracta.
    public Sumatoria (){
    }
    
    public Sumatoria(int sumando1, int sumando2){
        this.sumando1 = sumando1;
        this.sumando2 = sumando2;
    }
    
    
    //Los métodos set y get de una clase no abstracta.

    public void setSumando1(int sumando1) {
        this.sumando1 = sumando1;
    }

    public void setSumando2(int sumando2) {
        this.sumando2 = sumando2;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getSumando1() {
        return sumando1;
    }

    public int getSumando2() {
        return sumando2;
    }

    public int getResultado() {
        return resultado;
    }
    
    //Un método mostrarInformación() que permita ver por pantalla todos los atributos de un objeto.
    public void mostrarInformacion(){
        System.out.println("Sumando1: " + sumando1);
        System.out.println("Sumando2: " + sumando2);
        System.out.println("Resultado: " + resultado);
    }
    
    
    //Un método que devuelva un cálculo realizado con los atributos del objeto.
    @Override
    public void suma(){
        //para no destruir los valores de sumando 1 y 2 los almacenamos en un temporal
        int sumandoTemp;
        
        // inicializamos los arrays
        // esto da un tamaño fijo el short como maximo tiene 5 digitos
            byte array1[] = new byte[5];
            byte array2[] = new byte[5];
        
        // colocamos en cada posición del array el digito correspondiente
        sumandoTemp = sumando1;
        for (int i = 0; i < 5 ; i++) {
            array1[i]=(byte) (sumandoTemp%10);
            sumandoTemp=(int) (sumandoTemp/10);
        }
        
        // colocamos en cada posición del array el digito correspondiente
        sumandoTemp = sumando2;
        for (int i = 0; i < 5 ; i++) {
            array2[i]=(byte) (sumandoTemp%10);
            sumandoTemp=(int) (sumandoTemp/10);
        }
        
        int temp = 0;
        String acumulado = "";
        
        // con cada pasada del for suma primero unidades, luego decenas y asi sucesivamente
        // si el valor es mayor que 9 lleva 1 para la suma de la siguiente posición
        // va almacenando las sumas en el temp
        // almacena el valor total en el acumulado, lo trato como un String para que al recastearlo en un numero los 0 de las izquierda desaparescan.
        for (int i = 0; i < 5; i++) {
            temp = array1[i]+array2[i]+temp;
            acumulado = (temp%10) + acumulado;
            temp = temp/10;
        }
        
        // almacena el resultado
        resultado = Integer.parseInt(acumulado);

    }
    
    
    
}
