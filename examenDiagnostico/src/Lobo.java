public class Lobo extends Canino{

    private int numCamada;
    private String especieLobo;
    public Lobo(int numCamada, String especieLobo, String color, float tamanoColmillos, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(color, tamanoColmillos, habitat, altura, largo, peso, nombreCientifico);
        this.numCamada= numCamada;
        this. especieLobo = especieLobo;

    }

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

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


    public String comer(){
        return "carnivoro que come carne";
    };

    public  String dormir(){
        return  "duerme por el dia y caza por la noche";
    };

    public  String correr(){
        return  "corren por el bosque para cazar";
    };
    public  String comunicarse(){
        return "aullan";
    };

    @Override
    public String toString() {
        return "Lobo: " +'\n' +
                "habitat=" + getHabitat() + '\n' +
                "altura=" + getAltura() + '\n' +
                "largo=" + getLargo() +'\n' +
                "peso=" + getPeso() +'\n' +
                "nombreCientifico=" + getNombreCientifico() + '\n' +
                "numCamada=" + numCamada + '\n' +
                "especieLobo=" + especieLobo +'\n' +
                "color=" + color + '\n' +
                "tamanoColmillos=" + tamanoColmillos + '\n' +
                "comer=" + comer() + '\n' +
                "dormir=" + dormir() + '\n' +
                "correr=" + correr() + '\n' +
                "comunicarse=" + comunicarse() +'\n'  ;
    }
}
