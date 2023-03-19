
import java.io.*;


public class Articulo {

    private String codigo;
    private String descripcion;
    private int existencias;

    public Articulo() {
    }

    public Articulo(String codigo, String descripcion, int existencias) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.existencias = existencias;
    }
    
    public void compCodigo() {
        String cod = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("Introduce Codigo de producto");
                cod = br.readLine();
                if (!cod.matches("[A-Z]{2}.[0-9]{1,3}[a-zA-Z]+")) {
                    System.out.println("\nCODIGO NO VALIDO");
                    System.out.println("codigo: válido siempre que comience por dos letras mayúsculas, punto,\n"
                            + "entre 1 y 3 dígitos numéricos, y finalice con todas las letras mayúsculas o\n"
                            + "minúsculas que se quieran (mínimo una) \n");
                }
            } while (!cod.matches("[A-Z]{2}.[0-9]{1,3}[a-zA-Z]+"));
        } catch (IOException e) {
        } catch (Exception e) {
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
            }
        }
        codigo = cod;
    }
    //descripcion: válido siempre que sea una cadena de longitud entre 3 y 10 caracteres.

    public void compDescripcion() {
        String desc = null;
        BufferedReader br = null;
        boolean control = true;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("Introduce Una descripcion");
                desc = br.readLine();
                if (desc.length() < 3 || desc.length() > 10) {
                    System.out.println("\nDESCIPCION NO VALIDA");
                    System.out.println("descripcion: válido siempre que sea una cadena de longitud entre 3 y 10 caracteres\n");
                } else {
                    control = false;
                }
            } while (control);
        } catch (IOException e) {
        } catch (Exception e) {
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
            }
        }
        descripcion = desc;
    } //existencias: válida cualquier cantidad entera positiva y menor que 1000

    public void compExistencias() {
        int valor = 0;
        BufferedReader br = null;
        boolean control = true;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("Introduce una cantidad de existencias");
                valor = Integer.parseInt(br.readLine());
                if (valor <= 0 || valor >= 1000) {
                    System.out.println("\nEXISTENCIAS NO VALIDA");
                    System.out.println("existencias: válida cualquier cantidad entera positiva y menor que 1000\n");
                } else {
                    control = false;
                }
            } while (control);
        } catch (IOException e) {
        } catch (NumberFormatException e) {
        } catch (Exception e) {
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
            }
        }
        existencias = valor;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " Descripcion: " + descripcion + " Existencias: " + existencias;
    }
}
