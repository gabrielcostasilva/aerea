/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.modelo;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import com.avaliacao.entidade.OrigemVoo;
import com.avaliacao.entidade.Passageiro;
import com.avaliacao.negocio.IAviao;
import com.avaliacao.negocio.IDestinoVoo;
import com.avaliacao.negocio.IOrigemVoo;
import com.avaliacao.negocio.IVoo;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VooMB {

    private Date dataVoo;
    private OrigemVoo origemId;
    private DestinoVoo destinoId;
    private List<Aviao> avioes;
    private List<Passageiro> passageiros;

    @EJB
    private IVoo vooBean;

    @EJB
    private IOrigemVoo origemBean;

    @EJB
    private IDestinoVoo destinoBean;

    @EJB
    private IAviao aviaoBean;

    public VooMB()
    {
        super();
    }

    public String criar()
    {
        return "retorna_voo";
    }

    public List<OrigemVoo> listaOrigem()
    {
        return origemBean.consultar();
    }

    public List<DestinoVoo> listaDestino()
    {
        return destinoBean.consultar();
    }

    public List<Aviao> listaAvioes()
    {
        return aviaoBean.consultar();
    }

    public Date getDataVoo()
    {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo)
    {
        this.dataVoo = dataVoo;
    }

    public IVoo getVooBean()
    {
        return vooBean;
    }

    public void setVooBean(IVoo vooBean)
    {
        this.vooBean = vooBean;
    }

    public IOrigemVoo getOrigemBean()
    {
        return origemBean;
    }

    public void setOrigemBean(IOrigemVoo origemBean)
    {
        this.origemBean = origemBean;
    }

    public IDestinoVoo getDestinoBean()
    {
        return destinoBean;
    }

    public void setDestinoBean(IDestinoVoo destinoBean)
    {
        this.destinoBean = destinoBean;
    }

    public IAviao getAviaoBean()
    {
        return aviaoBean;
    }

    public void setAviaoBean(IAviao aviaoBean)
    {
        this.aviaoBean = aviaoBean;
    }

    public OrigemVoo getOrigemId()
    {
        return origemId;
    }

    public void setOrigemId(OrigemVoo origemId)
    {
        this.origemId = origemId;
    }

    public DestinoVoo getDestinoId()
    {
        return destinoId;
    }

    public void setDestinoId(DestinoVoo destinoId)
    {
        this.destinoId = destinoId;
    }

    public List<Aviao> getAvioes()
    {
        return avioes;
    }

    public void setAvioes(List<Aviao> avioes)
    {
        this.avioes = avioes;
    }

    public List<Passageiro> getPassageiros()
    {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros)
    {
        this.passageiros = passageiros;
    }

}
