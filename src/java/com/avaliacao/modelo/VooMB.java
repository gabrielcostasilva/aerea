
package com.avaliacao.modelo;

import com.avaliacao.entidade.OrigemVoo;
import com.avaliacao.entidade.Voo;
import com.avaliacao.negocio.IAviao;
import com.avaliacao.negocio.IDestinoVoo;
import com.avaliacao.negocio.IOrigemVoo;
import com.avaliacao.negocio.IVoo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VooMB {
    
    @EJB
    private IVoo vooBean;
    
    private Date dataVoo;
    
    @EJB
    private IDestinoVoo destinoVooBean;
    
    @EJB
    private IOrigemVoo origemVooBean;
    private Set<Long> 
    
    @EJB
    private IAviao aviaoBean;

    public IVoo getVooBean() {
        return vooBean;
    }

    public void setVooBean(IVoo vooBean) {
        this.vooBean = vooBean;
    }

    public Date getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }

    public Set<Long> getDestinoVooBean() {
        return destinoVooBean;
    }

    public void setDestinoVooBean(IDestinoVoo destinoVooBean) {
        this.destinoVooBean = destinoVooBean;
    }

    public Set<Long> getOrigemVooBean() {
        return (Set<Long>) origemVooBean;
    }

    public void setOrigemVooBean(IOrigemVoo origemVooBean) {
        this.origemVooBean = origemVooBean;
    }

    
    public String criar(){
        
        try{
            
            vooBean.criar(this.getDataVoo(),new ArrayList<>(this.getOrigemVooBean()), this.getDestinoVooBean());
          
           
            return "criado";        
        } catch(Exception e){
            return "erro";
        }
          }
    
    public List<Voo> consultar(){
       return vooBean.consultar();
   }
    
}
