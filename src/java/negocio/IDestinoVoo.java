/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Aluno
 */
@Local
public interface IDestinoVoo {


     boolean criar (DestinoVoo DestinoVoo);
     List<DestinoVoo> consultar();
    
}
