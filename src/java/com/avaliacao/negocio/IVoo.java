/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.negocio;

import com.avaliacao.entidade.Voo;
import static java.nio.file.Files.list;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Aluno
 */
@Local
public interface IVoo {
    
    boolean criar(Date dataVoo);
    boolean alterar(Long id, Date novaDataVoo, Long idNovoVoo);
    boolean deletar(Long id);
    List<Voo> consultar();
    
    
}
