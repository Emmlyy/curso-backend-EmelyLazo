package org.java.poointerfaces.repositorioArticulo;

import org.java.poointerfaces.modelo.Articulo;
import org.java.poointerfaces.modelo.Cliente;
import org.java.poointerfaces.repositorio.Direccion;
import org.java.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;

import java.util.ArrayList;
import java.util.List;

public class ArticuloListRepositorio implements OrdenablePaginableCrudRepositorioArt {

    private List<Articulo> dataSource;

    public ArticuloListRepositorio() {
        this.dataSource= new ArrayList<>();
    }

    @Override
    public List<Articulo> listar() {
        return dataSource;
    }

    @Override
    public Articulo porId(Integer id) {
        Articulo resultado = null;
        for (Articulo cli: dataSource){
            if (cli.getId() != null && cli.getId().equals(id)){
                resultado= cli;
                break;
            }
        }
        return  resultado;
    }

    @Override
    public void crear(Articulo art) {
        this.dataSource.add(art);
    }

    @Override
    public void editar(Articulo art) {

        Articulo c = this.porId(art.getId());
        c.setNombre(art.getNombre());
        c.setCategoria(art.getCategoria());
        c.setPrecio(art.getPrecio());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Articulo> listar(String campo, Direccion dir) {
        List<Articulo> listaOrdenada =new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a,b) ->{
            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo, a ,b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo,b, a);

            }
            return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Articulo> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
            return this.dataSource.size();
    }

    public static int ordenar(String campo, Articulo a, Articulo b){
        int resultado =0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getCategoria().compareTo(b.getCategoria());
        }
        return  resultado;
    }

}
