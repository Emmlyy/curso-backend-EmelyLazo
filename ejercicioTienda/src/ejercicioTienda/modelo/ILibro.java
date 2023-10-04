package ejercicioTienda.modelo;

import java.util.Date;

public interface ILibro {
    abstract public Date getFechaPublicacion();

    abstract public  String getAutor();

    abstract public String getTitulo();

    abstract public String getEditorial();
}
