package negocio;

import com.avaliacao.entidade.Passageiro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class PassageiroBean implements IPassageiro{
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean criar(Passageiro Passageiro) {
        em.persist(Passageiro);
       return true;
    }
    
     @Override
    public List<Passageiro> consultar() {
     return em.createQuery("SELECT a FROM PASSAGEIRO a",Passageiro.class).getResultList();    
    }
    
    
}
