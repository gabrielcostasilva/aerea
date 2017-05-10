package com.avaliacao.entidade;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Voo implements Serializable {
    
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;   
    
    @ManyToOne (fetch = FetchType.EAGER)
    private DestinoVoo destino;
    
    @ManyToOne (fetch = FetchType.EAGER)
    private OrigemVoo origem;
    
    @ManyToMany (fetch = FetchType.EAGER, mappedBy = "voos")
    private List<Aviao> avioes;
    
    @ElementCollection (fetch = FetchType.EAGER)
    private List<Passageiro> passageiros;

    public Voo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DestinoVoo getDestino() {
        return destino;
    }

    public void setDestino(DestinoVoo destino) {
        this.destino = destino;
    }

    public OrigemVoo getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemVoo origem) {
        this.origem = origem;
    }

    public List<Aviao> getAvioes() {
        return avioes;
    }

    public void setAvioes(List<Aviao> avioes) {
        this.avioes = avioes;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voo other = (Voo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Voo{" + "id=" + id + ", destino=" + destino + ", origem=" + origem + ", avioes=" + avioes + ", passageiros=" + passageiros + '}';
    }
}
