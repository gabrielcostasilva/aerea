/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.negocio;

import com.avaliacao.entidade.Passageiro;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IPassageiro {
    
    boolean criar(String nome, String documento);
    boolean alterar(Long id, String novoNome, String novoDocumento, Long idNovoPassageiro);
    boolean deletar(Long id);
    List<Passageiro> consultar();
}
