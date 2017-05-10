package com.avaliacao.negocio;

import com.avaliacao.entidade.OrigemVoo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OrigemBean implements IOrigem {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<OrigemVoo> consultar() {
        return em.createQuery
        ("SELECT o FROM OrigemVoo o", OrigemVoo.class).
                getResultList();
    }

    @Override
    public OrigemVoo consultar(Long id) {
        return em.createQuery
        ("SELECT o FROM OrigemVoo o WHERE o.id = " + id, OrigemVoo.class).
                getResultList().get(0);
    }
    
}
