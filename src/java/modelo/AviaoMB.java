package modelo;

import com.avaliacao.entidade.Aviao;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import negocio.IAviao;
import negocio.aviaoBean;

@ManagedBean
@ViewScoped
public class AviaoMB {
    
    private Aviao aviao;
    
    @EJB
    private IAviao aviaoBean;

    public AviaoMB() {
        super();
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
    
        
    public String criar() {
        
            aviaoBean.criar (this.getAviao());
            return "criado";
            
        
        
       // public List<Aviao> consultar(){
           // return aviaoBean.consultar();
        //}   
        
    }
}
