abstract public class mamifero {
    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

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

    abstract public String comer();

    abstract public  String dormir();

    abstract public  String correr();
    abstract public  String comunicarse();
}
