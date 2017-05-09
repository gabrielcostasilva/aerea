package com.avaliacao.negocio;

import com.avaliacao.entidade.Voo;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IVoo {
    
    boolean criar(String dataVoo);
    boolean alterar(Long id, String dataVoo);
    boolean deletar(Long id);
    
    List<Voo> consultar();

    public boolean criar(Date dataVoo);
    
}
