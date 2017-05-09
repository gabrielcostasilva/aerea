package com.avaliacao.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;


@Entity
public class Passageiro implements Serializable {
    private String nome;
    private String documento;

    @ElementCollection (fetch = FetchType.EAGER)
    private List<Voo> voo;
    
    public Passageiro() {
        super();
    }

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
