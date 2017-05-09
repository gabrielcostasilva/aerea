package com.avaliacao.negocio;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import com.avaliacao.entidade.OrigemVoo;
import com.avaliacao.entidade.Passageiro;
import com.avaliacao.entidade.Voo;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VooBean implements IVoo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean criar(Date dataVoo, OrigemVoo origem, DestinoVoo destino, List<Aviao> avioes, List<Passageiro> passageiros)
    {
        Voo v = new Voo();
        v.setDataVoo(dataVoo);
        v.setOrigem(origem);
        v.setDestino(destino);
        v.setAvioes(avioes);
        v.setPassageiros(passageiros);

        try {
            em.persist(v);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
