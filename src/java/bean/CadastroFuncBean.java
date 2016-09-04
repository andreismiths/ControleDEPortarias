/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entity.Funcionario;
import dao.FuncionarioDAO;
import java.util.List;
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
            System.out.println(listaFuncionario.get(i).getDataNascimUsuario());
            System.out.println(listaFuncionario.get(i).getEmailUsuario());
            System.out.println(listaFuncionario.get(i).getDepartanento());
            System.out.println(listaFuncionario.get(i).getSiapeUsuario());
            System.out.println(listaFuncionario.get(i).getDataEntrada());
             
         }
     }
  
}


 
    