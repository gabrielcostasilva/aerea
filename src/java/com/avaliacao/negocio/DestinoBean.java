package com.avaliacao.negocio;

import com.avaliacao.entidade.DestinoVoo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DestinoBean implements IDestino {

    @PersistenceContext
    private EntityManager em;

    public List<DestinoVoo> consultar() {
        return em.createQuery("SELECT o FROM DestinoVoo o", 
                DestinoVoo.class).
                getResultList();
    }

    @Override
    public DestinoVoo consultar(Long id) {
        return em.createQuery("SELECT o FROM DestinoVoo o WHERE o.id = " + id, 
                DestinoVoo.class).
                getResultList().get(0);
    }

}
