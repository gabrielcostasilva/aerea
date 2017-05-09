package com.avaliacao.negocio;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import com.avaliacao.entidade.OrigemVoo;
import com.avaliacao.entidade.Passageiro;
import java.util.Date;
import java.util.List;

public interface IVoo {

    public boolean criar(Date dataVoo, OrigemVoo origem, DestinoVoo destino, List<Aviao> avioes, List<Passageiro> passageiros);

}
