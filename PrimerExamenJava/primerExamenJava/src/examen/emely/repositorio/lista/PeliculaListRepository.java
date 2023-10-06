package examen.emely.repositorio.lista;

import examen.emely.modelo.Pelicula;
import examen.emely.repositorio.AbstractaListRepositorio;
import examen.emely.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class PeliculaListRepository extends AbstractaListRepositorio<Pelicula> {
    private List<Pelicula> dataSource;

        public PeliculaListRepository() {
            this.dataSource= new ArrayList<>();
        }

        @Override
        public List<Pelicula> listar() {
            return dataSource;
        }

        @Override
        public Pelicula porId(Integer id) {
            Pelicula resultado = null;
            for (Pelicula cli: dataSource){
                if (cli.getId() != null && cli.getId().equals(id)){
                    resultado= cli;
                    break;
                }
            }

            return  resultado;
        }

        @Override
        public void crear(Pelicula cliente) {
            this.dataSource.add(cliente);
        }

        public void editar(Pelicula cliente) {
            Pelicula c = this.porId(cliente.getId());
            c.setNombreDePelicula(cliente.getNombreDePelicula());
            c.setLugar(cliente.getLugar());
        }

        @Override
        public void eliminar(Integer id) {
            this.dataSource.remove(this.porId(id));
        }

        @Override
        public List<Pelicula> listar(String campo, Direccion dir) {
            List<Pelicula> listaOrdenada =new ArrayList<>(this.dataSource);
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
        public List<Pelicula> listar(int desde, int hasta) {
            return dataSource.subList(desde, hasta);
        }

        public static int ordenar(String campo, Pelicula a, Pelicula b){
            int resultado =0;
            switch (campo){
                case "id" -> resultado = a.getId().compareTo(b.getId());
                case "nombreDePelicula" -> resultado = a.getNombreDePelicula().compareTo(b.getNombreDePelicula());
                case "lugar" -> resultado = a.getLugar().compareTo(b.getLugar());
            }
            return  resultado;
        }

        @Override
        public int total() {
            return this.dataSource.size();
        }

}
