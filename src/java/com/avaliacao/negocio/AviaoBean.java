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

    public List<Aviao> consultar() {
        return em.createQuery("SELECT o FROM Aviao o",
                Aviao.class).
                getResultList();
    }

}
