package com.avaliacao.negocio;

import com.avaliacao.entidade.Aviao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AviaoBean implements IAviao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Aviao> consultar()
    {
        return em.createQuery("SELECT a FROM Aviao a", Aviao.class).getResultList();
    }

}
