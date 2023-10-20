// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! \n");

        Tigre tigre = new Tigre("Felidae", 0.33f, 65 , "selva", 1.2f, 2.22f, 5.1f, "Panthera tigris");
        Leon leon = new Leon(5,20,0.42f, 74,  "selva", 0.80f, 1.22f, 5.1f, "Panthera leo");
        Guepardo guepardo = new Guepardo(0.42f, 25,  "selva", 0.80f, 1.22f, 5.1f, "Acinonyx jubatus" );

        Lobo lobo = new Lobo(4,"C. lupus",  "cafe", 0.15f,  "bosque", 0.80f, 1.22f, 5.1f, " Canis lupus" );
        Perro perro = new Perro(50,"negro y blanco",   0.15f,  "casa", 0.80f, 1.22f, 5.1f, "Canis lupus" );


        System.out.println(tigre.toString());
        System.out.println(leon.toString());
        System.out.println(guepardo.toString());
        System.out.println(lobo.toString());
        System.out.println(perro.toString());

    }
}