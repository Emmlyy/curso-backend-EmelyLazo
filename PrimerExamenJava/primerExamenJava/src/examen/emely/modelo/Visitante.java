package examen.emely.modelo;

public class Visitante extends BaseEntity{
    private String nombre;

    public Visitante() {
    }

    public Visitante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Registrarse(){
        System.out.println("Registrarse...");

    }
    public void VerPelicula(){
        System.out.println("Ver pelicula...");
    }

    @Override
    public String toString() {
        return "Visitante: " +
                "nombre: " + nombre ;
    }
}
