package com.avaliacao.modelo;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import com.avaliacao.entidade.OrigemVoo;
import com.avaliacao.negocio.IAviao;
import com.avaliacao.negocio.IDestino;
import com.avaliacao.negocio.IOrigem;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class VooMB {

    private Date dataVoo;

    private OrigemVoo origemSelecionada;
    private DestinoVoo destinoSelecionado;
    private List<Aviao> avioesSelecionados;

    @EJB
    private IOrigem origemBean;
    
    @EJB
    private IDestino destinoBean;
    
    @EJB
    private IAviao aviaoBean;

    public List<Aviao> getAvioesSelecionados() {
        return avioesSelecionados;
    }

    public void setAvioesSelecionados(List<Aviao> avioesSelecionados) {
        this.avioesSelecionados = avioesSelecionados;
    }

    
    
    public DestinoVoo getDestinoSelecionado() {
        return destinoSelecionado;
    }

    public void setDestinoSelecionado(DestinoVoo destinoSelecionado) {
        this.destinoSelecionado = destinoSelecionado;
    }

    
    
    public OrigemVoo getOrigemSelecionada() {
        return origemSelecionada;
    }

    public void setOrigemSelecionada(OrigemVoo origemSelecionada) {
        this.origemSelecionada = origemSelecionada;
    }

    public Date getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }

    public List<OrigemVoo> listaOrigem() {
        return origemBean.consultar();
    }

    public List<DestinoVoo> listaDestino() {
        return destinoBean.consultar();
    }
    
    public List<Aviao> listaAviao() {
        return aviaoBean.consultar();
    }
}
