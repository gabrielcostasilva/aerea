package modelo;

import com.avaliacao.entidade.Passageiro;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import negocio.IPassageiro;
import negocio.PassageiroBean;

@ManagedBean
@ViewScoped

public class PassageiroMB {
    
    private Passageiro passageiro;
    
    @EJB
    private IPassageiro PassageiroBean;
    
    public PassageiroMB() {
        super();
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    
    public String criar() {
        
            PassageiroBean.criar (this.getPassageiro());
            return "criado";
    }
}
