package org.emely.collection.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetDuplicados {
    public static void main(String[] args) {

        String[] peces= {"Corvina", "Lenguado", "Pajerrey", "Robale", "Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez: peces){
            if(!unicos.add(pez)){
                //System.out.println("Elemento Duplicado: " + pez);
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Unicos" + unicos);
        System.out.println("Duplicados"+duplicados);
        //System.out.println(unicos.size() + "Elementos no duplicados: " + unicos);
    }
}
