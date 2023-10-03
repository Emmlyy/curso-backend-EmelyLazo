public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 2 ),
    HATCHBACK("Hatchback", "Auto compacto",5 ),
    PICKUP("Pickup", "Camioneta",4 ),
    COUPE("Coupe", "Auto pequeno",2 ),
    CONVERTIBLE("Convertible", "Auto deportivo",2 ),
    FURGON("Furgon", "Auto utilitario", 3 ),
    SUV("SUV", "Todo terrono deportivo",5 );
    private  final  String nombre;
    private  final  String descripcion;
    private  final  int numeroPuerta;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    @Override
    public String toString() {
        return "TipoAutomovil{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", numeroPuerta=" + numeroPuerta +
                '}';
    }
}
