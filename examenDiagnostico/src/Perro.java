public class Perro extends  Canino {
    private int fuerzaMordida;
    public Perro(int fuerzaMordida, String color, float tamanoColmillos, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(color, tamanoColmillos, habitat, altura, largo, peso, nombreCientifico);
        this.fuerzaMordida =  fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public float getTamanoColmillos() {
        return super.getTamanoColmillos();
    }

    @Override
    public void setTamanoColmillos(float tamanoColmillos) {
        super.setTamanoColmillos(tamanoColmillos);
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
        return "croquetas";
    };

    public  String dormir(){
        return  "duerme dia y noche ";
    };

    public  String correr(){
        return  "corren jugando";
    };
    public  String comunicarse(){
        return "labran";
    };

    @Override
    public String toString() {
        return "Perro: " +'\n' +
                "habitat=" + getHabitat() + '\n' +
                "altura=" + getAltura() + '\n' +
                "largo=" + getLargo() +'\n' +
                "peso=" + getPeso() +'\n' +
                "nombreCientifico=" + getNombreCientifico() + '\n' +
                "fuerzaMordida=" + fuerzaMordida + '\n' +
                "color=" + color + '\n' +
                "tamanoColmillos=" + tamanoColmillos + '\n' +
                "comer=" + comer() + '\n' +
                "dormir=" + dormir() + '\n' +
                "correr=" + correr() + '\n' +
                "comunicarse=" + comunicarse()+ '\n'  ;
    }


}
