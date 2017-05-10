package com.avaliacao.negocio;

import com.avaliacao.entidade.OrigemVoo;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IOrigem {

    public List<OrigemVoo> consultar();

}
