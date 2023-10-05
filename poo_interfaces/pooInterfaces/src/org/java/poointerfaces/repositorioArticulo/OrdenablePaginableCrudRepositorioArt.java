package org.java.poointerfaces.repositorioArticulo;

import org.java.poointerfaces.repositorio.ContableRepositorio;
import org.java.poointerfaces.repositorio.CrudRepositorio;
import org.java.poointerfaces.repositorio.OrdenableRepositorio;
import org.java.poointerfaces.repositorio.PaginableRepositorio;

public interface OrdenablePaginableCrudRepositorioArt extends OrdenableRepositorioArt,
        PaginableRepositorioArt, CrudRepositorioArt, ContableRepositorio {
}
