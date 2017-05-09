
package com.avaliacao.modelo;

import com.avaliacao.entidade.Voo;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DestinoMB {
    
private String nome;
private List<Voo> voos;

    @EJB
    private IDestino destinoBean;

}
