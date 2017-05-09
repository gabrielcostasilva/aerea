/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.negocios;

import com.avaliacao.entidade.Voo;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Aluno
 */
public class VooBean implements IVoo{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean criar(Date data, Origem origem, String destino, List<String> avioes) {
        Voo voo = new Voo();
        
        voo.setDataVoo(data);
        voo.setOrigemVoo(origem);
        voo.getDestinoVoo(destino);
    }

    @Override
    public List<Voo> consultar() {
        return em.createQuery("SELECT v FROM Voo v", Voo.class).getResultList();
    }
    
}
