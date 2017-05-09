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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePiloto;

    @ManyToMany(mappedBy = "avioes")
    private List<Voo> voos;

    public Aviao()
    {
        super();
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public String toString()
    {
        return "Aviao{" + "id=" + id + ", nomePiloto=" + nomePiloto + '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Aviao other = (Aviao) obj;
        return Objects.equals(this.id, other.id);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNomePiloto()
    {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto)
    {
        this.nomePiloto = nomePiloto;
    }

    public List<Voo> getVoos()
    {
        return voos;
    }

    public void setVoos(List<Voo> voos)
    {
        this.voos = voos;
    }

}
