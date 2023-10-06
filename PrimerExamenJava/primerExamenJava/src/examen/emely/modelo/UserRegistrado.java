package examen.emely.modelo;

public class UserRegistrado extends BaseEntity{
    private int id;
    private String nombre;
    private int numero;
    private String direccion;

    public UserRegistrado() {
    }
    public UserRegistrado(String nombre, int numero, String direccion) {
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
    }

    public UserRegistrado(int id, String nombre, int numero, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void IniciarSesion(){
        System.out.println("Iniciando sesion...");
    }
    public void CierreSesion(){
        System.out.println("Cerrando la sesion");
    }
    public void VerPelicula(Pelicula peli){
        System.out.println(this.nombre+ " Quiere Ver " + peli.nombreDePelicula);
    }
    public void ReservarBillete(Pelicula peli){
        System.out.println("Reservar boleto para ver " + peli.nombreDePelicula
        +  ", El dia " + peli.peliculaEspectaculo + ", en " + peli.lugar);
    }
    public void RealizarPago(){
        System.out.println("Realizar pago...");
    }
    public void CancelarBillete(){
        System.out.println("Cancelando Billete ...");
    }

    @Override
    public String toString() {
        return "UserRegistrado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
