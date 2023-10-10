package org.example.repository;

import com.mysql.cj.xdevapi.Client;
import jakarta.persistence.EntityManager;
import org.example.entity.Cliente;

import java.util.List;

public class ClienteRepository implements CrudRepository<Cliente> {

    private EntityManager em;

    public ClienteRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Cliente> listar() {
        return em.createQuery("SELECT C from  Cliente C",  Cliente.class).getResultList();
    }

    @Override
    public Cliente porId(Long id) {
        return em.find(Cliente.class,id);
    }

    @Override
    public void guardar(Cliente cliente) {
        if (cliente.getId() != null &&cliente.getId() >0){
            em.merge(cliente);
        }else {
            em.persist(cliente);
        }
    }

    @Override
    public void eliminar(Long id) {
        Cliente cliente = porId(id);
        em.remove(cliente);
    }
}
