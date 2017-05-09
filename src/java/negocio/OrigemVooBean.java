/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import com.avaliacao.entidade.OrigemVoo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Aluno
 */
public class OrigemVooBean implements IOrigemVoo{
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean criar(OrigemVoo origemVoo) {
       em.persist(origemVoo);
       return true;
    }
    
    @Override
    public List<OrigemVoo> consultar() {
     return em.createQuery("SELECT a FROM ORIGEMVOO a",OrigemVoo.class).getResultList();    
    }
}
