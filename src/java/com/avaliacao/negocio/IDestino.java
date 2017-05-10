package com.avaliacao.negocio;

import com.avaliacao.entidade.DestinoVoo;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IDestino {

    public List<DestinoVoo> consultar();
    public DestinoVoo consultar(Long id);

}
