package modelo;

import com.avaliacao.entidade.OrigemVoo;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import negocio.IOrigemVoo;

@ManagedBean
@ViewScoped
public class OrigemVooMB {
    private OrigemVoo origemVoo;

    public OrigemVooMB() {
        super();
    }
    
    @EJB
    private IOrigemVoo OrigemVooBean;

    public OrigemVoo getOrigemVoo() {
        return origemVoo;
    }

    public void setOrigemVoo(OrigemVoo origemVoo) {
        this.origemVoo = origemVoo;
    }
    
    public String criar() {
        
            OrigemVooBean.criar (this.getOrigemVoo());
            return "criado";
    }
    
}
