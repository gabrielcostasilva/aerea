package com.avaliacao.entidade;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Passageiro implements Serializable {
    
    private String nome;
    private String documento;
        
}
