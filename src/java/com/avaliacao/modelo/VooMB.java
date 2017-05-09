
package com.avaliacao.modelo;
import com.avaliacao.entidade.Passageiro;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class VooMB {
    
    @EJB
    private List<Passageiro> passageiros;
    
    @EJB 
    private IDestino destino;
    
    @EJB
    private IOrigem origem;
    
    @EJB
    private IAviao aviao;
        

}
