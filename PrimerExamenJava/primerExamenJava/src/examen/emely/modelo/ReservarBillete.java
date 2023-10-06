package examen.emely.modelo;

import java.util.Date;

public class ReservarBillete {
    private int numeroEntradaDisponible;
    private String nombrePelicula;
    private int mostrarNumero;
    private Date fecha;
    private String lugar;

    public ReservarBillete() {

    }

    public ReservarBillete(String nombrePelicula, int mostrarNumero, Date fecha, String lugar) {
        this.nombrePelicula = nombrePelicula;
        this.mostrarNumero = mostrarNumero;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public Integer getNumeroEntradaDisponible() {
        return numeroEntradaDisponible;
    }

    public void setNumeroEntradaDisponible(Integer numeroEntradaDisponible) {
        this.numeroEntradaDisponible = numeroEntradaDisponible;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getMostrarNumero() {
        return mostrarNumero;
    }

    public void setMostrarNumero(int mostrarNumero) {
        this.mostrarNumero = mostrarNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void ActualizarAsientosDispónibles(){
        System.out.println("Actualizando numero de asientos disponibles...");
    }

    @Override
    public String toString() {
        return "ReservarBillete{" +
                "numeroEntradaDisponible=" + numeroEntradaDisponible +
                ", nombrePelicula='" + nombrePelicula + '\'' +
                ", mostrarNumero=" + mostrarNumero +
                ", fecha=" + fecha +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
