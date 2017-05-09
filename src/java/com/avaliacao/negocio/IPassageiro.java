
package com.avaliacao.negocio;

import com.avaliacao.entidade.Passageiro;
import java.util.List;
import javax.ejb.Local;


@Local
public interface IPassageiro {
    List<Passageiro> consultar();
}
