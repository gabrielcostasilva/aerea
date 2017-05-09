
package com.avaliacao.modelo;

import com.avaliacao.negocio.IPassageiro;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PassageiroMB {
    
    private String nome;
    private String documento;
    
    @EJB
    private IPassageiro passageiro;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String criar(){
        
        try {
            passageiro.criar(this.getNome(), this.getDocumento());
            return "criado";
        }catch(Exception e){
           return "erro"; 
        }
        
    }
}
