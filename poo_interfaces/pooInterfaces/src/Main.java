import org.java.poointerfaces.modelo.Cliente;
import org.java.poointerfaces.repositorio.ClienteListRepositorio;
import org.java.poointerfaces.repositorio.Direccion;
import org.java.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzales"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Andres", "Guzman"));

       /* List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("====Paginables====");
        List<Cliente> paginable = repo.listar(1,4);
        paginable.forEach(System.out::println);
*/
        System.out.println("====Ordenar====");
        List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
        for (Cliente c: clientesOrdenAsc) System.out.println(c);

        System.out.println("====Editar====");
        Cliente beaActualizar =new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println("=====================");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("=====Eliminar======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("========Total===========");
        System.out.println("Total registros: " + repo.total());

    }
}