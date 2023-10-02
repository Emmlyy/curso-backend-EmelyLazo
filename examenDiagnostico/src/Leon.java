public class Leon extends Felino{
 private  int numManada;
 private  float potenciaRugidoDecibel;
    public Leon(int numManada, float potenciaRugidoDecibel, float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso, nombreCientifico);
        this.numManada= numManada;
        this. potenciaRugidoDecibel= potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public void setNumManada(int numManada) {
        this.numManada = numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
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

    @Override
    public float getTamanoGarra() {
        return super.getTamanoGarra();
    }

    @Override
    public int getVelocidad() {
        return super.getVelocidad();
    }

    @Override
    public void setTamanoGarra(float tamanoGarra) {
        super.setTamanoGarra(tamanoGarra);
    }

    @Override
    public void setVelocidad(int velocidad) {
        super.setVelocidad(velocidad);
    }

    public String comer(){
        return "carnivoro que come carne";
    };

    public  String dormir(){
        return  "duermen por la noche";
    };

    public  String correr(){
        return  "corren hasta a "+ velocidad +"km/h";
    };
    public  String comunicarse(){
        return "GRRRRR";
    };

    @Override
    public String toString() {
        return "Leon: " + '\n'+
                "habitat=" + getHabitat() + '\n' +
                "altura=" + getAltura() + '\n' +
                "largo=" + getLargo() +'\n' +
                "peso=" + getPeso() +'\n' +
                "nombreCientifico=" + getNombreCientifico() + '\n' +
                "numManada=" + numManada +'\n'+
                "potenciaRugidoDecibel=" + potenciaRugidoDecibel +'\n'+
                "tamanoGarra=" + tamanoGarra +'\n'+
                "velocidad=" + velocidad + '\n'+
                "comer=" + comer() + '\n' +
                "dormir=" + dormir() + '\n' +
                "correr=" + correr() + '\n' +
                "comunicarse=" + comunicarse() + '\n' ;
    }
}
