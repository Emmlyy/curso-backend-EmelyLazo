package org.emly.poointerfaces.repositorio.list;

import org.emly.poointerfaces.modelo.Articulo;
import org.emly.poointerfaces.repositorio.AbstractaListRepositorio;
import org.emly.poointerfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ArtListRepositorio extends AbstractaListRepositorio<Articulo> {


    @Override
    public void crear(Articulo producto) {
        this.dataSource.add(producto);
    }

    @Override
    public void editar(Articulo producto) {
        Articulo a= porId(producto.getId());

    }

    @Override
    public List<Articulo> listar(String campo, Direccion dir) {
        List<Articulo> listOrdenada = new ArrayList<>(this.dataSource);
        listOrdenada.sort((a,b)->{
            int resultado =0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo, a ,b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo,b, a);

            }
            return resultado;
        });
        return listOrdenada;
    }

    public static int ordenar(String campo, Articulo a, Articulo b){
        int resultado =0;
        switch (campo){
            //case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDespcripcion().compareTo(b.getDespcripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return  resultado;
    }
}
