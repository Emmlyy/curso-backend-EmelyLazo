package org.emly;

import org.emly.poointerfaces.modelo.Articulo;
import org.emly.poointerfaces.modelo.Cliente;
import org.emly.poointerfaces.repositorio.AbstractaListRepositorio;
import org.emly.poointerfaces.repositorio.Direccion;
import org.emly.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.emly.poointerfaces.repositorio.list.ArtListRepositorio;
import org.emly.poointerfaces.repositorio.list.ClienteListRepositorio;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Cliente> repoCliente = new ClienteListRepositorio();
        repoCliente.crear(new Cliente("Jano", "Perez"));
        repoCliente.crear(new Cliente("Bea", "Gonzales"));
        repoCliente.crear(new Cliente("Luci", "Martinez"));
        repoCliente.crear(new Cliente("Andres", "Guzman"));

        AbstractaListRepositorio<Articulo>  repoArt = new ArtListRepositorio();
        repoArt.crear(new Articulo("Mesa de comedor",  120d));
        repoArt.crear(new Articulo("Ladrillo",  5d));
        repoArt.crear(new Articulo("Lampara", 35d));
        repoArt.crear(new Articulo("Silla de comedor", 66d));

        System.out.println("=====Clientes=====");

        List<Cliente> clientes = repoCliente.listar();
        clientes.forEach(System.out::println);

        System.out.println("====Producto====");

        List<Articulo> producto = repoArt.listar();
        producto.forEach(System.out::println);

        System.out.println("=====================");
        System.out.println("====Paginables====");
        System.out.println("=====================");

        System.out.println("=====Clientes=====");
        List<Cliente> paginableC = repoCliente.listar(1,4);
        paginableC.forEach(System.out::println);
        System.out.println("====Producto====");
        List<Articulo> paginableA = repoArt.listar(1,4);
        paginableA.forEach(System.out::println);

        System.out.println("=====================");
        System.out.println("====Ordenar====");
        System.out.println("=====================");
        System.out.println("=====Clientes=====");
        List<Cliente> clientesOrdenAscC = repoCliente.listar("apellido", Direccion.ASC);
        for (Cliente c: clientesOrdenAscC) System.out.println(c);
        System.out.println("====Producto====");
        List<Articulo> clientesOrdenAscA = repoArt.listar("precio", Direccion.ASC);
        for (Articulo c: clientesOrdenAscA) System.out.println(c);

        /*System.out.println("====Editar====");
        Cliente beaActualizar =new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println("=====================");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("=====Eliminar======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);*/

        System.out.println("========Total===========");
        System.out.println("Total registros Clientes: " + repoCliente.total());
        System.out.println("Total registros Productos: " + repoArt.total());
        System.out.println("Registros totales almacenados: " +  Math.addExact(repoCliente.total(),repoArt.total()));

    }
}