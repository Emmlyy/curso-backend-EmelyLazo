package examen.emely;

import examen.emely.modelo.*;
import examen.emely.repositorio.Direccion;
import examen.emely.repositorio.OrdenablePaginableCrudRepositorio;
import examen.emely.repositorio.lista.AdminListRepository;
import examen.emely.repositorio.lista.PeliculaListRepository;
import examen.emely.repositorio.lista.UserListRepository;
import examen.emely.repositorio.lista.VisitantesListRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Pelicula> repoPeliculas = new PeliculaListRepository();
        repoPeliculas.crear(new Pelicula("La monja", "Galerias"));
        repoPeliculas.crear(new Pelicula("Patito feo", "Metrocentro"));
        repoPeliculas.crear(new Pelicula("Mario Bro", "Plaza mundo, soyapango"));
        repoPeliculas.crear(new Pelicula("Barbie", "La gran via"));

        List<Admin> administradores = new ArrayList<>();
        OrdenablePaginableCrudRepositorio<Admin> repoAdmin= new AdminListRepository();
        administradores.add(new Admin("Pato", "0234"));
        administradores.add(new Admin("Cata", "8740"));
        administradores.add(new Admin("Luci", "0000"));
        administradores.add(new Admin("Jano", "64210"));

        //llenar el repositorio con los datos de la lista
        Object a[]= administradores.toArray();
        for ( int i=0; i<a.length; i++){
            repoAdmin.crear((Admin) a[i]);
            //System.out.println( a[i]);
        }

        OrdenablePaginableCrudRepositorio<Visitante> repoVisitante = new VisitantesListRepository();
        repoVisitante.crear(new Visitante("Maria"));
        repoVisitante.crear(new Visitante("Juan"));
        repoVisitante.crear(new Visitante("Carlos"));
        repoVisitante.crear(new Visitante("Oscar"));
        repoVisitante.crear(new Visitante("Marcelo"));
        repoVisitante.crear(new Visitante("Alex"));
        repoVisitante.crear(new Visitante("Daniel"));

        OrdenablePaginableCrudRepositorio<UserRegistrado> repoUser = new UserListRepository();
        repoUser.crear(new UserRegistrado("Emely", 2411, "Cojutepeque"));
        repoUser.crear(new UserRegistrado("Oscar", 354, "Santa tecla"));
        repoUser.crear(new UserRegistrado("Oscar", 741, "Chalate"));
        repoUser.crear(new UserRegistrado("Daniel", 0027, "Soya"));
        repoUser.crear(new UserRegistrado("Marcelo", 9614, "Cojutepeque"));


        //ListaEnlazadaBilletes
        LinkedList<ReservarBillete> enlazada = new LinkedList<>();
        enlazada.add(new ReservarBillete("Barbie", 22,new Date("12/5/23"), "La gran via"));
        enlazada.add(new ReservarBillete("La monja", 11,new Date("15/5/23"), "Galerias"));
        enlazada.add(new ReservarBillete("Patito feo", 9,new Date("13/5/23"), "Metrocentro"));
        enlazada.add(new ReservarBillete("Barbie", 78,new Date("19/5/23"), "La gran via"));
        enlazada.add(new ReservarBillete("Mario Bro", 66,new Date("11/5/23"), "Plaza mundo"));

        System.out.println("=====Peliculas Disponibles=====");

        List<Pelicula> peliculas = repoPeliculas.listar();
        peliculas.forEach(System.out::println);

        System.out.println("=====Administradores desde la lista=====");

        //Object a[]= administradores.toArray();
        for ( int i=0; i<a.length; i++){
            System.out.println( a[i]);
        }

        List<Visitante> ordenarVisitantes = repoVisitante.listar("nombre", Direccion.ASC);
        System.out.println("=====Ordenar todos los visitantes Visitantes=====");
        ordenarVisitantes.forEach(System.out::println);

        System.out.println("=====Paginar Visitantes=====");
        List<Visitante> paginableC = repoVisitante.listar(1,4);
        paginableC.forEach(System.out::println);

        System.out.println("=====Usuarios Registrados=====");
        List<UserRegistrado> usuarios = repoUser.listar();
        usuarios.forEach(System.out::println);

        UserRegistrado emely = new UserRegistrado("Emely", 2411, "Cojutepeque");
        usuarios.add(emely);

        System.out.println("=====Usuarios Registrados Actualizada=====");
        usuarios.forEach(System.out::println);

        Pelicula peli = new Pelicula("Gran turismo", new Date("7/10/23"),"Galerias");
        peliculas.add(peli);

        Admin keny = new Admin("keny", "hola1234");
        administradores.add(keny);
        System.out.println("=====ACCIONES DEL administrador "+  keny.getNombre() +"=====");
        keny.AnadirRegistroPelicula(peli);
        keny.ActualizarRegistroPelicula(peli);
        System.out.println("=====Peliculas Actualizadas=====");
        peliculas.forEach(System.out::println);

        System.out.println("=====ACCIONES DEL USUARIO "+  emely.getNombre() +"=====");
        emely.IniciarSesion();
        emely.VerPelicula(peli);
        emely.ReservarBillete(peli);
        emely.RealizarPago();
        emely.CancelarBillete();
        emely.CierreSesion();

    }
}