package com.avaliacao.negocio;

import com.avaliacao.entidade.DestinoVoo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DestinoVooBean implements IDestinoVoo {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<DestinoVoo> consultar()
    {
        return em.createQuery("SELECT d FROM DestinoVoo d", DestinoVoo.class).getResultList();
    }

}
