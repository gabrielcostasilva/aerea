/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.avaliacao.entidade.DestinoVoo;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import negocio.DestinoVooBean;
import negocio.IDestinoVoo;

/**
 *
 * @author Aluno
 */
@ManagedBean
@ViewScoped
public class DestinoVooMB {
    private DestinoVoo destinoVoo;

    public DestinoVooMB() {
        super();
    }
    
    @EJB
    private IDestinoVoo destinoVooBean;

    public DestinoVoo getDestinoVoo() {
        return destinoVoo;
    }

    public void setDestinoVoo(DestinoVoo destinoVoo) {
        this.destinoVoo = destinoVoo;
    }
    
    public String criar() {
        
            destinoVooBean.criar (this.getDestinoVoo());
            return "criado";
    }
    
    
}
