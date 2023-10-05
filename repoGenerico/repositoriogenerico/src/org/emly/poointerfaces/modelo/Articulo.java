package org.emly.poointerfaces.modelo;

public class Articulo extends BaseEntity{

    private int id;
    private String despcripcion;

    private Double precio;

    public Articulo(String despcripcion, Double precio) {
        super();
        this.despcripcion = despcripcion;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDespcripcion() {
        return despcripcion;
    }

    public void setDespcripcion(String despcripcion) {
        this.despcripcion = despcripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "despcripcion='" + despcripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
