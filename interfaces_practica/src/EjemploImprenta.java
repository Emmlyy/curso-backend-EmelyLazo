import interface_practice.imprenta.modelo.*;

import static interface_practice.imprenta.modelo.Imprimible.TEXTO_DEFECTO;
import static interface_practice.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(
                new Persona("John", "Doe"),
                "Ingeniero de sistemas", " Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollo Fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseno : Elem. Reusables POO",
                Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron singleton"))
                .addPagina(new Pagina("Patron observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Compose"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"), "Estudio sobre microservisios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible(){
            @Override
            public String imprimir(){
                return"Hola que tal, imprimiendo un objeto generico de una clase anonima";
            }
        });

        System.out.println(TEXTO_DEFECTO);

    }
}
