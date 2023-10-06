package examen.emely.modelo;

import java.util.Date;

public class Pelicula extends BaseEntity{
    public String nombreDePelicula;
    public Date peliculaEspectaculo;
    public String lugar;

    public Pelicula() {
    }
    public Pelicula(String nombreDePelicula, String lugar) {
        this.nombreDePelicula = nombreDePelicula;
        this.lugar = lugar;
    }

    public Pelicula(String nombreDePelicula, Date peliculaEspectaculo, String lugar) {
        this.nombreDePelicula = nombreDePelicula;
        this.peliculaEspectaculo = peliculaEspectaculo;
        this.lugar = lugar;
    }

    public String getNombreDePelicula() {
        return nombreDePelicula;
    }

    public void setNombreDePelicula(String nombreDePelicula) {
        this.nombreDePelicula = nombreDePelicula;
    }

    public Date getPeliculaEspectaculo() {
        return peliculaEspectaculo;
    }

    public void setPeliculaEspectaculo(Date peliculaEspectaculo) {
        this.peliculaEspectaculo = peliculaEspectaculo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void DetallesActualizacion(){
        System.out.println("Detalles actualizacion");

    }

    @Override
    public String toString() {
        String detalles =  "nombreDePelicula: " + nombreDePelicula  + ", lugar=" + lugar ;

        if(peliculaEspectaculo != null)
            detalles += ", peliculaEspectaculo=" + peliculaEspectaculo ;

        return detalles;
    }
}
