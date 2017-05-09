/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import com.avaliacao.entidade.Passageiro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Aluno
 */
@Local
public interface IPassageiro {
    
    boolean criar (Passageiro Passageiro);
     List<Passageiro> consultar();
}
