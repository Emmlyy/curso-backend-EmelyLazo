abstract public class mamifero {
    private String habitat;
    private float altura;
    private float largo;
    private float peso;
    private String nombreCientifico;

    public mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {

        this.habitat= habitat;
        this.altura= altura;
        this.largo= largo;
        this.peso= peso;
        this.nombreCientifico = nombreCientifico;
    }

    public  mamifero(){};
    public String getHabitat() {
        return habitat;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public float getAltura() {
        return altura;
    }
    public float getLargo() {
        return largo;
    } public float getPeso() {
        return peso;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setLargo(float largo) {
        this.largo = largo;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "mamifero{" +
                "habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }

    public String comer;

    public  String dormir;

    public  String correr;
    public  String comunicarse;
}
