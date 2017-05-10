package com.avaliacao.negocio;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import com.avaliacao.entidade.OrigemVoo;
import com.avaliacao.entidade.Passageiro;
import com.avaliacao.entidade.Voo;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IVoo {

    public List<Voo> consultar();
    public void criar(OrigemVoo origem, DestinoVoo destino, List<Aviao> avioes, List<Passageiro> passageiros, Date dataVoo);

}
