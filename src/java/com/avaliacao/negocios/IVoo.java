/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.negocios;

import com.avaliacao.entidade.Voo;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IVoo {
    
    boolean criar(Date data, String Origem, String Destino, List<String> avioes);
    List<Voo> consultar();
    
}
