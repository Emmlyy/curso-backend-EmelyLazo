package org.java.poointerfaces.modelo;

import java.util.Objects;

public class Articulo {
    private Integer id;
    private String nombre;
    private String categoria;

    private int precio;
    private  static  int ultimoId;

    public Articulo() {
        this.id= ++ultimoId;
    }

    public Articulo(String nombre, String categoria, int precio) {
        this();
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Articulo.ultimoId = ultimoId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Articulo articulo)) return false;
        return Objects.equals(id, articulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
