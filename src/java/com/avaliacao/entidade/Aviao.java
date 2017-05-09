package com.avaliacao.entidade;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Aviao implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePiloto;
    
    @ManyToMany (mappedBy="voo")
    private List<nomeTripulacao> nomeTripulacao;
    
    public Aviao(){
        super();
    }

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

    public List<nomeTripulacao> getNomeTripulacao() {
        return nomeTripulacao;
    }

    public void setNomeTripulacao(List<nomeTripulacao> nomeTripulacao) {
        this.nomeTripulacao = nomeTripulacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Aviao other = (Aviao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aviao{" + "id=" + id + ", nomePiloto=" + nomePiloto + ", nomeTripulacao=" + nomeTripulacao + '}';
    }

    private static class nomeTripulacao {

        public nomeTripulacao() {
        }
    }
    
    
}
