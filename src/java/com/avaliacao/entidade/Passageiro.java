package com.avaliacao.entidade;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Passageiro implements Serializable {
    
    private String nome;
    private String documento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
        
}
