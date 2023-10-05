package org.java.poointerfaces.repositorioArticulo;

import org.java.poointerfaces.modelo.Articulo;
import org.java.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorioArt {
    List<Articulo> listar(int desde, int hasta);

}
