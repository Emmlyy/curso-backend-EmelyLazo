package examen.emely.repositorio.lista;

import examen.emely.modelo.Pelicula;
import examen.emely.modelo.Visitante;
import examen.emely.repositorio.AbstractaListRepositorio;
import examen.emely.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class VisitantesListRepository extends AbstractaListRepositorio<Visitante> {
    private List<Visitante> dataSource;

    public VisitantesListRepository() {
        this.dataSource= new ArrayList<>();
    }

    @Override
    public List<Visitante> listar() {
        return dataSource;
    }

    @Override
    public Visitante porId(Integer id) {
        Visitante resultado = null;
        for (Visitante cli: dataSource){
            if (cli.getId() != null && cli.getId().equals(id)){
                resultado= cli;
                break;
            }
        }

        return  resultado;
    }

    @Override
    public void crear(Visitante visitante) {
        this.dataSource.add(visitante);
    }

    public void editar(Visitante visitante) {
        Visitante c = this.porId(visitante.getId());
        c.setNombre(visitante.getNombre());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Visitante> listar(String campo, Direccion dir) {
        List<Visitante> listaOrdenada =new ArrayList<>(this.dataSource);
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
    public List<Visitante> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    public static int ordenar(String campo, Visitante a, Visitante b){
        int resultado =0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
        }
        return  resultado;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

}
