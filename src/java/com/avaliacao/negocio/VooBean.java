package com.avaliacao.negocio;

import com.avaliacao.entidade.Voo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VooBean implements IVoo {
    
    @PersistenceContext
    private EntityManager em;

    public List<Voo> consultar() {
        return em.createQuery("SELECT o FROM Voo o", 
                Voo.class).
                getResultList();
    }
}
