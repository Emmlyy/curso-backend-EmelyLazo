package examen.emely.modelo;

public class RealizarPago {
    private int id;
    private float importe;
    private int idTransaccion;
    private String IdentificadorDeUser;

    public RealizarPago() {
    }

    public RealizarPago(float importe, int idTransaccion, String identificadorDeUser) {
        this.importe = importe;
        this.idTransaccion = idTransaccion;
        IdentificadorDeUser = identificadorDeUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getIdentificadorDeUser() {
        return IdentificadorDeUser;
    }

    public void setIdentificadorDeUser(String identificadorDeUser) {
        IdentificadorDeUser = identificadorDeUser;
    }

    public void ConfirmanlaTransaccion(){
        System.out.println("Transaccion realizada con exito!");
    }
    public void DevolucionDineroCasoCancelacion(){
        System.out.println("Devolviendo dinero...");

    }

    @Override
    public String toString() {
        return "RealizarPago{" +
                "id=" + id +
                ", importe=" + importe +
                ", idTransaccion=" + idTransaccion +
                ", IdentificadorDeUser='" + IdentificadorDeUser + '\'' +
                '}';
    }
}
