
package com.avaliacao.modelo;

import com.avaliacao.entidade.Voo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.FetchType;



@ManagedBean
@ViewScoped
public class OrigemMB {
    
private String nome;

private List<Voo> voos;

    @EJB
    private IOrigem origemBean;

}
