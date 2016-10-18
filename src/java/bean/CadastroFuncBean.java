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
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.FlowEvent;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

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
    
    private Funcionario user;
    
    private StreamedContent imagem;
    
    private boolean skip;
    
    
    
    //Getters e Setters

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public StreamedContent getImagem() {
        return imagem;
    }

    public void setImagem(StreamedContent imagem) {
        this.imagem = imagem;
    }
    
    public Funcionario getUser() {
        return user;
    }
    
    public void setUser(Funcionario user) {
        this.user = user;
    }

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
    
    
    public void AtualizaFunc (){
        funcdao.atualizar(funcionario);
        super.displayInfoMessageToUser("Funcionário Atualizado com Sucesso!");
    }
    
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "Confirmar";
        }
        else {
            return event.getNewStep();
        }
    }
    
    public void listarPPerfil (){
        listaFuncionario = funcdao.listar();
         for (int i = 0; i <listaFuncionario.size(); i++) {
            
            System.out.println(listaFuncionario.get(i).getEmailUsuario());
            System.out.println(listaFuncionario.get(i).getSenhaUsuario());
            System.out.println(listaFuncionario.get(i).getFoto());
            
             
         }
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
     
     public void handleToggle(ToggleEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Painel", "Visibilidade:" + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void handleFileUpload(FileUploadEvent event) {
        try {
            imagem = new DefaultStreamedContent(event.getFile().getInputstream());
            byte[] foto = event.getFile().getContents();
            this.funcionario.setFoto(foto);
        } catch (IOException ex) {
            Logger.getLogger(CadastroFuncBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void limpaImagem() {
        this.imagem = new DefaultStreamedContent();
    }
   
}


 
    