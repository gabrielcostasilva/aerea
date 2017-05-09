
package com.avaliacao.modelo;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.negocio.IAviao;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AviaoMB {
    
    
    private Long id;
    private String nomePiloto;
    
    private List<String> nomeTripulacao;
    
    @EJB
    private IAviao aviao;
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public List<String> getNomeTripulacao() {
        return nomeTripulacao;
    }

    public void setNomeTripulacao(List<String> nomeTripulacao) {
        this.nomeTripulacao = nomeTripulacao;
    }
    
    public List<Aviao> consultar(){
        
        return aviao.consultar();
    }
}
