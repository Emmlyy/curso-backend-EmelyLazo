package org.emely;

import jakarta.persistence.EntityManager;
import org.emely.entity.Cliente;
import org.emely.entity.Factura;
import org.emely.util.JpaUtil;

public class HibernateAsociacionesManyToOneFind {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        try {


            em.getTransaction().begin();
            Cliente cliente = em.find(Cliente.class, 1L);

            Factura factura = new Factura("compras de oficina", 1000L);
            factura.setCliente(cliente);
            em.persist(factura);

            System.out.println(factura.getCliente());
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
