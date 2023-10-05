package org.java.poointerfaces.repositorioArticulo;

import org.java.poointerfaces.modelo.Articulo;
import org.java.poointerfaces.modelo.Cliente;
import org.java.poointerfaces.repositorio.Direccion;

import java.util.List;

public interface OrdenableRepositorioArt {
    List<Articulo> listar(String campo, Direccion dir);

}
