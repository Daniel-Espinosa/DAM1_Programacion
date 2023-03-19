
package Hoja14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Principal {


    public static void main(String[] args) {
        
        int cont=1;
        LinkedList <Candidato> listaCandidatos = new LinkedList();
        
        Candidato c1 = new Candidato("Ana", 53);
        Candidato c2 = new Candidato("Bea", 57);
        Candidato c3 = new Candidato("Oliver", 59);
        Candidato c4 = new Candidato("Leo", 63);
        Candidato c5 = new Candidato("Lia", 55);
        Candidato c6 = new Candidato("Anais", 51);
        
        listaCandidatos.add(c1);
        listaCandidatos.add(c2);
        listaCandidatos.add(c3);
        listaCandidatos.add(c4);
        
        
        System.out.println("prueba " + cont +"º");
        for (Candidato i : listaCandidatos) {
            System.out.println(i.toString());    
        }
        cont++;
        
        
        listaCandidatos.add(1, c5);
        
        System.out.println("prueba " + cont +"º");
        for (Candidato i : listaCandidatos) {
            System.out.println(i.toString());
        }
        cont++;
        
        listaCandidatos.set(0, c6);
        
        System.out.println("prueba " + cont +"º");
        for (Candidato i : listaCandidatos) {
            System.out.println(i.toString());
        }
        cont++;
        
        listaCandidatos.remove(c3);
        
        System.out.println("prueba " + cont +"º");
        for (Candidato i : listaCandidatos) {
            System.out.println(i.toString());
        }
        cont++;
        
        listaCandidatos.removeLast();
        
        System.out.println("prueba " + cont +"º");
        for (Candidato i : listaCandidatos) {
            System.out.println(i.toString());
        }
        cont++;
        
        System.out.println("el 5º candidato esta en la posicion: ");
        System.out.println(listaCandidatos.indexOf(c5));
        
        System.out.println("prueba de for");
        for (int i = 0; i < listaCandidatos.size(); i++) {
            System.out.println(listaCandidatos.get(i).toString());
        }
        
        System.out.println("prueba de iterator");
        Iterator <Candidato> it = listaCandidatos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        
        System.out.println("Sublistas");
        // con esta creo una sublista pero no se almacena en ningun lado por ende solo la puedo imprimir de manera fea
        System.out.println(listaCandidatos.subList(1, listaCandidatos.size()));
        System.out.println(listaCandidatos.size());
        
        // para almacenarla creo una nueva lista (listadillo) y la almaceno para mostrarla guay ;)
        LinkedList <Candidato> listadillo = new LinkedList<>();
        listadillo.addAll(listaCandidatos.subList(1, listaCandidatos.size()));
        for (Candidato i : listadillo) {
            System.out.println(i.toString());
        }
        
        
        
        //PUNTO 11
        System.out.println("punto 11");
        ArrayList <Candidato> listaJefe = new ArrayList<>();
        
        Candidato j1 = new Candidato("Tomas", 40);
        Candidato j2 = new Candidato("Teresa", 43);
        
        listaJefe.add(j1);
        listaJefe.add(j2);
        
        System.out.println("mostrar lista de Jefes por iterator");
        Iterator <Candidato> it2 = listaJefe.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next().toString());
        }
        
        listaCandidatos.addAll(0, listaJefe);
        
        System.out.println("añadidas las dos listas las muestro");
        for (Candidato i : listaCandidatos) {
            System.out.println(i.toString());
        }
        
        
        
        
        
        
        
    }
    
}
