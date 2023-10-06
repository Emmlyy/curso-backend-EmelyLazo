package examen.emely.modelo;

public class Admin extends BaseEntity{
    private int id;
    private String nombre;
    private String contra;

    public Admin() {
    }

    public Admin( String nombre, String contra) {
        //this.id = id;
        this.nombre = nombre;
        this.contra = contra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void AnadirRegistroPelicula(Pelicula peli){
        System.out.println("Anadiendo registro de pelicula " + peli.nombreDePelicula);

    }
    public void ActualizarRegistroPelicula(Pelicula peli){
        System.out.println("Actualizando registro de pelicula");

    }
    public void EliminandoRegistroPelicula(Pelicula peli){
        System.out.println("Eliminando registro de pelicula");
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre=" + nombre +
                ", contra=" + contra ;
    }
}
