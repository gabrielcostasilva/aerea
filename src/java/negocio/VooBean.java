package negocio;

import com.avaliacao.entidade.Voo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class VooBean implements IVoo{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean criar(Voo Voo) {
        em.persist(Voo);
       return true;
    }

    @Override
    public List<Voo> consultar() {
        return em.createQuery("SELECT a FROM VOO a",Voo.class).getResultList();  
    }
    
}
