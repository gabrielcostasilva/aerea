package com.avaliacao.negocio;

import com.avaliacao.entidade.Voo;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IVoo {

    public List<Voo> consultar();

}
