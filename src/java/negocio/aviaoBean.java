package negocio;

import com.avaliacao.entidade.Aviao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class aviaoBean  implements IAviao{
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean criar(Aviao aviao) {
       em.persist(aviao);
       return true;
    }

    @Override
    public List<Aviao> consultar() {
        return em.createQuery("SELECT a FROM AVIAO a",Aviao.class).getResultList();
    }
    
    
}
