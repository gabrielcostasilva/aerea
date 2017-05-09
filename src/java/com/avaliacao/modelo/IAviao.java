package com.avaliacao.modelo;

import com.avaliacao.entidade.Voo;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IAviao {
    
    List<Voo> consultar();
    
}
