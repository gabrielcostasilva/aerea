/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.negocio;

import com.avaliacao.entidade.DestinoVoo;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IDestino {
    
    boolean criar(String nome);
    boolean alterar(Long id,String Destino, Long idNovoDestino);
    boolean deletar(Long id);
    List<DestinoVoo> consultar();
    
}
