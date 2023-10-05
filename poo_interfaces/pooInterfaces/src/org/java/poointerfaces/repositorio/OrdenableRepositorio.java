package org.java.poointerfaces.repositorio;

import org.java.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
