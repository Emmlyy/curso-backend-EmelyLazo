package org.java.poointerfaces.repositorio;

import org.java.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);

}
