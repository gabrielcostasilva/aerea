/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avaliacao.modelo;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.entidade.DestinoVoo;
import com.avaliacao.excecao.EntidadeJaExiste;
import com.avaliacao.negocio.IDestino;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aluno
 */
@ManagedBean
@ViewScoped
public class DestinoMB {
    
    private String nome;
    
    @EJB
    private IDestino destinoBean;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String criar(){
        try {
            destinoBean.criar(this.getNome());
            return "criado";
        } catch (EntidadeJaExiste e){
            return "entidadeJaExiste";
        } catch (Exception e) {
            return "erro";
        }
        
    }
    
    public List<DestinoVoo> consultar(){
        return destinoBean.consultar();
    }
}
