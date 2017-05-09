/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.modelo;

import com.avaliacao.negocio.IVoo;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@ManagedBean
@ViewScoped
public class VooMB {
    @Temporal(TemporalType.DATE)
    private Date dataVoo;
    
    @EJB
    private IVoo vooBean;

    public Date getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }
    
    
    
}
