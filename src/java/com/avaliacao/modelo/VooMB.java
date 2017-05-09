/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.modelo;

import com.avaliacao.entidade.Voo;
import com.avaliacao.negocios.IVoo;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VooMB {
    
    private Voo voo;
    
    private @EJB IVoo vooBean;
    
    public VooMB() {
        super();
        voo = new Voo();
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    public String criar(){
        
        try {
            vooBean.criar(this.getVoo());
            return "Criado";
        } catch (Exception e) {
            return "Erro";
        }
        
    }
    
    public List<Voo> consultar(){
        return vooBean.consultar();
    }
}
