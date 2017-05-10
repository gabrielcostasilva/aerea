package com.avaliacao.negocio;

import com.avaliacao.entidade.Aviao;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IAviao {

    public List<Aviao> consultar();
    public Aviao consultar(Long id);

}
