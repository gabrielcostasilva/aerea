package com.avaliacao.entidade;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Voo implements Serializable {
    
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;  
    
    @Temporal (TemporalType.DATE)
    private Date dataVoo;
    
    @ManyToMany (fetch = FetchType.EAGER)
		private List<Aviao> avioes;
    
    @ManyToOne (fetch = FetchType.EAGER)
        private DestinoVoo destinoVoo;
    
    @ManyToOne (fetch = FetchType.EAGER)
        private OrigemVoo origemVoo;
    
    @ElementCollection (fetch = FetchType.EAGER)
	private List<Passageiro> passageiro;

    public Voo() {
        super();
    }

    
    public Date getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }

    public List<Aviao> getAvioes() {
        return avioes;
    }

    public void setAvioes(List<Aviao> avioes) {
        this.avioes = avioes;
    }

    public DestinoVoo getDestinoVoo() {
        return destinoVoo;
    }

    public void setDestinoVoo(DestinoVoo destinoVoo) {
        this.destinoVoo = destinoVoo;
    }

    public OrigemVoo getOrigemVoo() {
        return origemVoo;
    }

    public void setOrigemVoo(OrigemVoo origemVoo) {
        this.origemVoo = origemVoo;
    }

    public List<Passageiro> getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(List<Passageiro> passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
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
        return "Voo{" + "id=" + id + ", dataVoo=" + dataVoo + ", avioes=" + avioes + ", destinoVoo=" + destinoVoo + ", origemVoo=" + origemVoo + ", passageiro=" + passageiro + '}';
    }
    
    
}
