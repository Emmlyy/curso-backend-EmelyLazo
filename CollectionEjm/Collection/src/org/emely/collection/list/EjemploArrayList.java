package org.emely.collection.list;

import org.emely.collection.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("esta vacia= " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(0, new Alumno("Jano", 7));
        al.set(3, new Alumno("andres", 3));

        System.out.println(al + ", size = "+ al.size());

        al.remove(new Alumno("Jano",7));

        System.out.println(al+ ", size= "+al.size());

        boolean b= al.contains(new Alumno("Cata", 6));
        System.out.println("La lista contiene a Cata ="+b);

        Object a[]= al.toArray();
        for ( int i=0; i<a.length; i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }



    }
}
