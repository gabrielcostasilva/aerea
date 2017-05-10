package com.avaliacao.negocio;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import com.avaliacao.entidade.OrigemVoo;
import com.avaliacao.entidade.Passageiro;
import com.avaliacao.entidade.Voo;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VooBean implements IVoo {

    @PersistenceContext
    private EntityManager em;
    
    @EJB
    private IOrigem origemBean;

    @EJB
    private IDestino destinoBean;
    
    @EJB
    private IAviao aviaoBean;
    
    public List<Voo> consultar() {
        return em.createQuery("SELECT o FROM Voo o",
                Voo.class).
                getResultList();
    }

    public void criar(OrigemVoo origem, DestinoVoo destino, List<Aviao> avioes, List<Passageiro> passageiros, Date dataVoo) {

        Voo voo = new Voo();
        voo.setDataVoo(dataVoo);
        voo.setPassageiros(passageiros);
        voo.setOrigem(origem);
        voo.setDestino(destino);
        voo.setAvioes(avioes);
        
        em.persist(voo);
    }
}
