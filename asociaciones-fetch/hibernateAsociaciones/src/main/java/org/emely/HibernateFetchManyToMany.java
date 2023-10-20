package org.emely;

import jakarta.persistence.EntityManager;
import org.emely.entity.Alumno;
import org.emely.util.JpaUtil;

import java.util.List;

public class HibernateFetchManyToMany {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        List<Alumno> alumnos = em.createQuery("select distinct a from Alumno a left outer join fetch a.cursos", Alumno.class).getResultList();
        alumnos.forEach(a -> System.out.println(a.getNombre() + ", cursos: " + a.getCursos()));
        em.close();

    }
}
