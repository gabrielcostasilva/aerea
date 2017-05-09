
package com.avaliacao.modelo;

import com.avaliacao.entidade.OrigemVoo;
import com.avaliacao.negocio.IOrigemVoo;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class OrigemVooMB {
    
    private Long id;
    private String nome;
    
    @EJB
    private IOrigemVoo origemVoo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<OrigemVoo> consultar(){
        
        return origemVoo.consultar();
    }
    
}
