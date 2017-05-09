/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Aluno
 */
public class DestinoVooBean implements IDestinoVoo{
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean criar(DestinoVoo DestinoVoo) {
        em.persist(DestinoVoo);
       return true;
    }

    @Override
    public List<DestinoVoo> consultar() {
     return em.createQuery("SELECT a FROM DESTINOVOO a",DestinoVoo.class).getResultList();    
    }

   

    
}


