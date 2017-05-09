package modelo;

import com.avaliacao.entidade.Voo;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import negocio.IVoo;

@ManagedBean
@ViewScoped
public class VooMB {
    
    private Voo voo;
     
    @EJB
    private IVoo VooBean;

    public VooMB() {
        super();
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    public String criar() {
        
        VooBean.criar (this.getVoo());
        return "criado";
    }
    
}
