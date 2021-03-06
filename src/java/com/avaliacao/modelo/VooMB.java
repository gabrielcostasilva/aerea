package com.avaliacao.modelo;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import com.avaliacao.entidade.OrigemVoo;
import com.avaliacao.entidade.Passageiro;
import com.avaliacao.entidade.Voo;
import com.avaliacao.negocio.IAviao;
import com.avaliacao.negocio.IDestino;
import com.avaliacao.negocio.IOrigem;
import com.avaliacao.negocio.IVoo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class VooMB {

    private Date dataVoo;

    private OrigemVoo origemSelecionada;
    private DestinoVoo destinoSelecionado;
    private List<Aviao> avioesSelecionados;

    private Passageiro passageiro;
    private List<Passageiro> passageiros;

    @EJB
    private IOrigem origemBean;

    @EJB
    private IDestino destinoBean;

    @EJB
    private IAviao aviaoBean;

    @EJB
    private IVoo vooBean;
    
    
    public VooMB() {
        passageiro = new Passageiro();
    }

    public List<Aviao> getAvioesSelecionados() {
        return avioesSelecionados;
    }

    public void setAvioesSelecionados(List<Aviao> avioesSelecionados) {
        this.avioesSelecionados = avioesSelecionados;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
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

    public List<Voo> listaVoos() {
        return vooBean.consultar();
    }

    public String adicionaPassageiro() {

        if (passageiros == null) {
            passageiros = new ArrayList<>();
        }

        passageiros.add(passageiro);

        passageiro = new Passageiro();
        
        return "adicionado";
    }
    
    public String criar() {
        
        try {
            vooBean.criar(origemSelecionada, destinoSelecionado, avioesSelecionados, passageiros, dataVoo);
            return "criado";
            
        } catch (Exception e) {
            System.out.println(e);
            return "principal";
            
        }
        
        
    }
}
