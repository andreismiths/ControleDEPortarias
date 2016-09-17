/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Funcionario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import dao.FuncionarioDAO;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;

/**
 *
 * @author andreismiths
 */
@ManagedBean(name = "CadastroFunc")
@SessionScoped

public class CadastroFuncBean extends AbstractMB {

    /**
     
     
     
     * Creates a new instance of CadastroFuncBean
     */
    @Inject
    private FuncionarioDAO funcdao;
    
    private Funcionario funcionario = new Funcionario();
    
    private String mensagem;
    
    private List<Funcionario> listaFuncionario;
    
    
        
    //Getters e Setters

    public FuncionarioDAO getFuncdao() {
        return funcdao;
    }

    public void setFuncdao(FuncionarioDAO funcdao) {
        this.funcdao = funcdao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public List<Funcionario> getListaFuncionario() {
        return funcdao.listar();
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }
    
    public void criaFunc (){
        funcdao.inserir(funcionario);
        super.displayInfoMessageToUser("Funcionário Cadastrado com Sucesso!");
    }
    
     public  void listandoFuncionario(){
        listaFuncionario = funcdao.listar();
         for (int i = 0; i <listaFuncionario.size(); i++) {
            System.out.println(listaFuncionario.get(i).getNomeUsuario());
            System.out.println(listaFuncionario.get(i).getCpfUsuario());
            System.out.println(listaFuncionario.get(i).getSiapeUsuario());
            System.out.println(listaFuncionario.get(i).getDataNascimUsuario());
            System.out.println(listaFuncionario.get(i).getEmailUsuario());
            System.out.println(listaFuncionario.get(i).getSenhaUsuario());
            System.out.println(listaFuncionario.get(i).getTipoUsuario());
             
         }
     }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.listaFuncionario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CadastroFuncBean other = (CadastroFuncBean) obj;
        if (!Objects.equals(this.listaFuncionario, other.listaFuncionario)) {
            return false;
        }
        return true;
    }
     
     
  
}


 
    