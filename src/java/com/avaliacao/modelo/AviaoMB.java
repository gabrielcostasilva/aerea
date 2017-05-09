
package com.avaliacao.modelo;

import com.avaliacao.entidade.Aviao;
import com.avaliacao.excecao.EntidadeJaExiste;
import com.avaliacao.negocio.IAviao;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AviaoMB {
    private String nome;
    
    @EJB
    private IAviao aviaoBean;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public IAviao getAviaoBean() {
        return aviaoBean;
    }

    public void setAviaoBean(IAviao aviaoBean) {
        this.aviaoBean = aviaoBean;
    }
    
    public String criar(){
        try {
            aviaoBean.criar(this.getNome());
            return "criado";
        } catch (EntidadeJaExiste e){
            return "entidadeJaExiste";
        } catch (Exception e) {
            return "erro";
        }
        
    }
    
    public List<Aviao> consultar(){
        return aviaoBean.consultar();
    }
    
}
