package com.avaliacao.modelo;

import com.avaliacao.entidade.Voo;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IVoo {
    
    boolean criar (Date dataVoo);
    boolean alterar (Long id, Date dataVoo);
    boolean deletar (Long id);
    List<Voo> conultar();
}
