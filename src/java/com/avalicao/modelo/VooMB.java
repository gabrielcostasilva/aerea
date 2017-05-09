package com.avalicao.modelo;

import com.avaliacao.entidade.Voo;
import com.avaliacao.negocio.IVoo;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VooMB {
    
    private Long id; 
    private Date dataVoo;
    
    @EJB
    private IVoo voo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }

    public IVoo getVoo() {
        return voo;
    }

    public void setVoo(IVoo voo) {
        this.voo = voo;
    }
    
    public String criar() {
        
        if(voo.criar(this.dataVoo))
            return "criado";
        
        else
            return "erro";
        
    }
    
    public List<Voo> consultar(){
        return voo.consultar();
    }
    
}
