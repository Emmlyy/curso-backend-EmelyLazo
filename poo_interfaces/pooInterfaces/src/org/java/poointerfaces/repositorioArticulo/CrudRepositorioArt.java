package org.java.poointerfaces.repositorioArticulo;

import org.java.poointerfaces.modelo.Articulo;
import org.java.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorioArt {
    List<Articulo> listar();
    Articulo porId(Integer id);
    void crear(Articulo art);
    void editar(Articulo art);
    void eliminar(Integer Id);
}
