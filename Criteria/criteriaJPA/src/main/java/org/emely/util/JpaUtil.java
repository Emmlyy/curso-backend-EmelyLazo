package org.emely.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory entityManagerFactory = builEntityManagerFactory();

    private static EntityManagerFactory builEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("ejemploJPA");
    }

    public static EntityManager getEntityManager(){return entityManagerFactory.createEntityManager();}


}
