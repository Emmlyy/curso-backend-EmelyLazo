package examen.emely.repositorio.lista;

import examen.emely.modelo.Admin;
import examen.emely.modelo.Visitante;
import examen.emely.repositorio.AbstractaListRepositorio;
import examen.emely.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class AdminListRepository extends AbstractaListRepositorio<Admin> {
    private List<Admin> dataSource;

    public AdminListRepository() {
        this.dataSource= new ArrayList<>();
    }

    @Override
    public List<Admin> listar() {
        return dataSource;
    }

    @Override
    public Admin porId(Integer id) {
        Admin resultado = null;
        for (Admin cli: dataSource){
            if (cli.getId() != null && cli.getId().equals(id)){
                resultado= cli;
                break;
            }
        }

        return  resultado;
    }

    @Override
    public void crear(Admin ad) {
        this.dataSource.add(ad);
    }

    public void editar(Admin admin) {
        Admin c = this.porId(admin.getId());
        c.setNombre(admin.getNombre());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Admin> listar(String campo, Direccion dir) {
        List<Admin> listaOrdenada =new ArrayList<>(this.dataSource);
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
    public List<Admin> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    public static int ordenar(String campo, Admin a, Admin b){
        int resultado =0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "contra" -> resultado = a.getContra().compareTo(b.getContra());

        }
        return  resultado;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

}
