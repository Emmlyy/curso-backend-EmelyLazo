abstract public class Felino extends mamifero{
    protected float tamanoGarra;
    protected int velocidad;

    public Felino(float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso, String nombreCientifico ) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarra= tamanoGarras;
        this.velocidad= velocidad;
    }

   /* public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }*/

    @Override
    public String getHabitat() {
        return super.getHabitat();
    }

    @Override
    public String getNombreCientifico() {
        return super.getNombreCientifico();
    }

    @Override
    public float getAltura() {
        return super.getAltura();
    }

    @Override
    public float getLargo() {
        return super.getLargo();
    }

    @Override
    public float getPeso() {
        return super.getPeso();
    }

    @Override
    public void setHabitat(String habitat) {
        super.setHabitat(habitat);
    }

    @Override
    public void setNombreCientifico(String nombreCientifico) {
        super.setNombreCientifico(nombreCientifico);
    }

    @Override
    public void setAltura(float altura) {
        super.setAltura(altura);
    }

    @Override
    public void setLargo(float largo) {
        super.setLargo(largo);
    }

    @Override
    public void setPeso(float peso) {
        super.setPeso(peso);
    }

    public float getTamanoGarra() {
        return tamanoGarra;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setTamanoGarra(float tamanoGarra) {
        this.tamanoGarra = tamanoGarra;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Felino{" +
                "tamanoGarra=" + tamanoGarra +
                ", velocidad=" + velocidad +
                ", comer='" + comer + '\'' +
                ", dormir='" + dormir + '\'' +
                ", correr='" + correr + '\'' +
                ", comunicarse='" + comunicarse + '\'' +
                '}';
    }


}
