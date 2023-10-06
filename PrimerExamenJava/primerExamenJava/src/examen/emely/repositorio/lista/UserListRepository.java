package examen.emely.repositorio.lista;

import examen.emely.modelo.Pelicula;
import examen.emely.modelo.UserRegistrado;
import examen.emely.modelo.Visitante;
import examen.emely.repositorio.AbstractaListRepositorio;
import examen.emely.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class UserListRepository extends AbstractaListRepositorio<UserRegistrado> {
    private List<UserRegistrado> dataSource;

    public UserListRepository() {
        this.dataSource= new ArrayList<>();
    }

    @Override
    public List<UserRegistrado> listar() {
        return dataSource;
    }

    @Override
    public UserRegistrado porId(Integer id) {
        UserRegistrado resultado = null;
        for (UserRegistrado cli: dataSource){
            if (cli.getId() != null && cli.getId().equals(id)){
                resultado= cli;
                break;
            }
        }

        return  resultado;
    }

    @Override
    public void crear(UserRegistrado user) {
        this.dataSource.add(user);
    }

    public void editar(UserRegistrado user) {
        UserRegistrado c = this.porId(user.getId());
        c.setNombre(user.getNombre());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<UserRegistrado> listar(String campo, Direccion dir) {
        List<UserRegistrado> listaOrdenada =new ArrayList<>(this.dataSource);
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
    public List<UserRegistrado> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    public static int ordenar(String campo, UserRegistrado a, UserRegistrado b){
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
