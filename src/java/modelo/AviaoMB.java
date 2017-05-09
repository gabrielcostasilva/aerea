package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AviaoMB {
    
    private Aviao aviao;
    
    //@EJB
    //private IAviao aviaoBean;

    public AviaoMB() {
        super();
        atividade = new Atividade();
    }
    
    
    
}
