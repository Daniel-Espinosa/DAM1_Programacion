
public class Principal {

    public static void main(String[] args) {
       
        String array[][] = new String [][]{{".",",",".",","},{".",",",".",","},{".",",",".",","},{".",",",".",","},{".",",",".",","}};
        String array2[][] = new String [4][5];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (j%2 == 0) {
                    array2[i][j] = "+";
                } else{
                    array2[i][j] = "-";
                }
                System.out.print(array2[i][j] + " ");
                
            }
            System.out.println("");
        }
    }
   
}
