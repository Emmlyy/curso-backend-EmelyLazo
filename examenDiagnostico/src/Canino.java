public class Canino extends mamifero{
    protected String color;
    protected float tamanoColmillos;
    public Canino(String color, float tamanoColmillos, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }


    @Override
    public String toString() {
        return "Canino{" +
                "color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", comer='" + comer + '\'' +
                ", dormir='" + dormir + '\'' +
                ", correr='" + correr + '\'' +
                ", comunicarse='" + comunicarse + '\'' +
                '}';
    }
}
