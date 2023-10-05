import org.java.poointerfaces.modelo.Articulo;
import org.java.poointerfaces.modelo.Cliente;
import org.java.poointerfaces.repositorio.ClienteListRepositorio;
import org.java.poointerfaces.repositorio.Direccion;
import org.java.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.java.poointerfaces.repositorioArticulo.ArticuloListRepositorio;
import org.java.poointerfaces.repositorioArticulo.OrdenablePaginableCrudRepositorioArt;

import java.util.List;

public class EjemploArt {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorioArt repo = new ArticuloListRepositorio();
        repo.crear(new Articulo("Mesa de comedor", "Cocina", 120));
        repo.crear(new Articulo("Ladrillo", "Construccion", 5));
        repo.crear(new Articulo("Lampara", "Hogar", 35));
        repo.crear(new Articulo("Silla de comedor", "Cocina", 66));

       List<Articulo> articulos = repo.listar();
        articulos.forEach(System.out::println);
        System.out.println("====Paginables====");
        List<Articulo> paginable = repo.listar(1,4);
        paginable.forEach(System.out::println);

        System.out.println("====Ordenar====");
        List<Articulo> artOrdenAsc = repo.listar("precio", Direccion.ASC);
        for (Articulo c: artOrdenAsc) System.out.println(c);

        System.out.println("====Editar====");
        Articulo camaActualizar =new Articulo("Cama king", "Hogar",250);
        camaActualizar.setId(2);
        repo.editar(camaActualizar);
        Articulo cama = repo.porId(2);
        System.out.println(cama);
        System.out.println("=====================");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("=====Eliminar======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("========Total===========");
        System.out.println("Total registros: " + repo.total());


    }
}
