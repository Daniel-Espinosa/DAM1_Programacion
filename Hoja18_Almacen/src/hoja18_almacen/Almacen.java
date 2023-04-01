package hoja18_almacen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Almacen {
    private ArrayList <Articulo> almacen = new ArrayList();
    private HashMap <String,String> historial = new HashMap();
    private String nombreAlmacen;
    
    
    public void annadirArticulo(){
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader teclado = new BufferedReader (isr);
        String codigo, descripcion;
        int existencias;
        boolean existe;
        Articulo art1 = new Articulo();
        try{
            do{    
                existe=false;
                System.out.println("Introduce el código del artículo.");
                codigo=teclado.readLine();
                for(Articulo a: almacen){
                    if (codigo.equals(a.getCodigo())){
                        existe=true;
                        System.out.println("Ese código ya ha sido registrado.");
                    }
                }
            }while(art1.validarCodigo(codigo)==false||existe==true);

            do{
                System.out.println("Introduce la descripción del artículo.");
                descripcion=teclado.readLine();
            } while (!art1.validarDescripcion(descripcion));

            do{
                System.out.println("Introduce las existencias del artículo.");
                existencias=Integer.parseInt(teclado.readLine());
            }while (!art1.validarExistencias(existencias));
            almacen.add(new Articulo (codigo, descripcion, existencias));
            historial.put(descripcion, codigo);
        }catch (IOException e){
            System.err.println("IOException");
        }
        
    }
    
    public void visualizarAlmacen (){
        
        if(!almacen.isEmpty()){
            System.out.println("Mostrando el inventario.");
            for (Articulo a: almacen){
                System.out.println(a.toString());
            }
        }else{
            System.out.println("El almacén esta vacío.");
        }
    }
    
    public void mostrarPedidos (){
        System.out.println("Mostrando pedidos necesarios a realizar.");
        for (Articulo a: almacen){
            if (a.getExistencias()<10){
                System.out.println(a.toString());
                System.out.println("\tFaltan "+(10-a.getExistencias())+ " unidades para tener diez.");
            }
        }
    }
    
     public void cantidadDistintos(){
        int cantidad=0;
        for (Articulo a: almacen){
            cantidad++;
        }
         System.out.println("El número de artículos distintos es: "+cantidad);
    }
     
    public void totalExistencias(){
        int total=0;
        for (Articulo a: almacen){
            total+=a.getExistencias();
        }
         System.out.println("El total de existencias es: "+total);
    }
    
    
    public void modificarExistencias(){
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader teclado = new BufferedReader (isr);
        String codigo;
        int existencias;
          try {    
            System.out.println("Introduce el código del artículo.");
            codigo=teclado.readLine();
            System.out.println("Introduce la nueva cantidad de existencias.");
            existencias=Integer.parseInt(teclado.readLine());
            for (Articulo a: almacen){
                if(codigo.equals(a.getCodigo())){
                    a.setExistencias(existencias);
                }
            }
        } catch (IOException ex) {
              System.err.println("IOException");
        }
    }
    
    public void borrarArticulo(){
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader teclado = new BufferedReader (isr);
        String codigo;
        boolean borrado=false;
          try {    
            System.out.println("Introduce el código del artículo.");
            codigo=teclado.readLine();
            Iterator <Articulo> it = almacen.iterator();
            while (it.hasNext()&&borrado==false){
                Articulo a = it.next();
                if (a.getCodigo().equals(codigo)){
                    it.remove();
                    borrado=true;
                    System.out.println("Elemento borrado.");
                }
            }
            if(borrado==false){
                System.out.println("Ese artículo no se encuentra en el almacén.");
            }
        } catch (IOException ex) {
              System.err.println("IOException");
        }
    }
    
    public void guardarFichero(){
        ObjectOutputStream oos = null;
        ObjectOutputStream oos2 = null;
        try {
            FileOutputStream fos = new FileOutputStream(nombreAlmacen+".dat");
            FileOutputStream fos2 = new FileOutputStream("historial.dat");
            oos = new ObjectOutputStream(fos);
            oos2 = new ObjectOutputStream(fos2);
            
            oos.writeObject(almacen);
            oos2.writeObject(historial);
        } catch (IOException ex) {
            System.err.println("IOException");
        } finally {
            try {
                if (oos!=null){
                    oos.close();
                }
                if (oos2!=null){
                    oos2.close();
                }
            } catch (IOException ex) {
                System.err.println("IOException");
            }
        }
                
    }
    
    public void leerFichero(){
        ObjectInputStream ois = null;
        ObjectInputStream ois2 = null;
        File almacen = new File(nombreAlmacen+".dat");
        File historial = new File("historial.dat");
        try {
            if (almacen.exists()){
                System.out.println("Importando archivo.");
                FileInputStream fis = new FileInputStream(nombreAlmacen+".dat");
                ois = new ObjectInputStream(fis);
                this.almacen=(ArrayList)ois.readObject();
            } else {
                System.out.println("Creando archivo");
                almacen.createNewFile();
            }
            if (historial.exists()){
                FileInputStream fis2 = new FileInputStream("historial.dat");
                ois2=new ObjectInputStream(fis2);
                this.historial=(HashMap)ois2.readObject();
            }
        } catch (IOException ex) {
            System.err.println("IOException");
        } catch (ClassNotFoundException ex) {
            System.err.println("Clase no encontrada");
        } finally {
            try {
                if (ois!=null){
                    ois.close();
                }
                if (ois2!=null){
                    ois2.close();
                }
            } catch (IOException ex) {
                System.out.println("IOException");
            }
        }
                
    }
    
    public void cambiarAlmacen (){
       
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader teclado = new BufferedReader (isr);
        String nomAlmacen;
         try {
            do{
                System.out.println("Introduce el nombre del almacén que quieres usar.");
                nomAlmacen=teclado.readLine();
            }while(!nomAlmacen.matches("[A-Za-z0-9]{1,}"));
            if(!almacen.isEmpty()){
                guardarFichero();
                almacen.clear();
            }
           
            this.nombreAlmacen=nomAlmacen;
            leerFichero();
        } catch (IOException ex) {
             System.err.println("IOException");
        }
    }

    public HashMap<String, String> getHistorial() {
        return historial;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }
    

    
}
