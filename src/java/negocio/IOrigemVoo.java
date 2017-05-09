/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.OrigemVoo;
import java.util.List;
import javax.ejb.Local;

@Local

public interface IOrigemVoo {
    
    boolean criar (OrigemVoo OrigemVoo);
     List<OrigemVoo> consultar();
   
}