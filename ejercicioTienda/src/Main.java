import ejercicioTienda.modelo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Calendar.DATE;

public class Main {
    public static void main(String[] args) {

        IPhone iphone = new IPhone(850,"Apple", "15", "Blanco");
        TvLcd tv= new TvLcd(300, "Samsung", 21);
        Libro libro = new Libro(25, new Date(), "J. K. R", "Harry Potter", "Editorial Universal");
        Comics comics = new Comics(18, new Date(), "Jueanito Gonzales", "One Piece", "Editorial Planeta", "juan" );

        ArrayList<Producto> ar = new ArrayList(4);
        ar.add(iphone);
        ar.add(tv);
        ar.add(libro);
        ar.add(comics);

        for (Producto producto: ar){
            System.out.println(imprimir(producto));
        }


    }
    public static String imprimir(Producto producto){
        String detalle = "============\n"
                + "Tipo de: " + producto.getClass() + "\n"
                + "Precio: " + producto.getPrecio() +"\n"
                + "Precio Final: " + producto.getPrecioVenta() + "\n";

            if (producto instanceof Electronico){
                detalle += "Fabricante: " + ((Electronico) producto).getFabricante()+"\n";
                if (producto instanceof IPhone){
                    detalle += "Modelo: " + ((IPhone) producto).getModelo() + "\n"
                                + "Color: " + ((IPhone) producto).getColor() + "\n";
                }else {
                    detalle += "Pulgadas: " + ((TvLcd) producto).getPulgada() + "\n";
                }
            } else if (producto instanceof Libro) {
                detalle += "Fecha de Publicacion: " + ((Libro) producto).getFechaPublicacion() + "\n"
                        + "Autor: " + ((Libro) producto).getAutor() + "\n"
                        + "Titulo: " + ((Libro) producto).getTitulo() + "\n"
                        + "Editorial: " + ((Libro) producto).getEditorial() + "\n";
                if (producto instanceof  Comics){
                    detalle += "Personaje: " + ((Comics) producto).getPersonaje() + "\n";
                }
            }
        return detalle;
    }
}