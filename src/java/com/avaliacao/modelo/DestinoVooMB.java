
package com.avaliacao.modelo;

import com.avaliacao.entidade.DestinoVoo;
import com.avaliacao.negocio.IDestinoVoo;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DestinoVooMB {
    
    private Long id;
    private String nome;
    
    @EJB
    private IDestinoVoo destinoVoo;

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
    
    public List<DestinoVoo> consultar(){
        
        return destinoVoo.consultar();
    }
}
