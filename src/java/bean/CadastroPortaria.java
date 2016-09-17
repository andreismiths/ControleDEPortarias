package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entity.Portaria;
import dao.PortariaDAO;
import entity.Funcionario;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;

/**
 *
 * @author andreismiths
 */

@ManagedBean(name = "CadastroPort")
@SessionScoped

public class CadastroPortaria extends AbstractMB {

    @Inject
    private PortariaDAO portdao;
    
    private Portaria portaria = new Portaria();
    
    private String mensagem;
    
    private List<Portaria> listaPortaria;
    
    private List<Funcionario> listaFuncionario;
    
    private List<Funcionario> funcionarioSelecionado;
    
    private boolean skip;
    

//Getters e Setters

    public List<Funcionario> getFuncionarioSelecionado() {
        return funcionarioSelecionado;
    }

    public void setFuncionarioSelecionado(List<Funcionario> funcionarioSelecionado) {
        this.funcionarioSelecionado = funcionarioSelecionado;
    }
    
    public PortariaDAO getPortdao() {
        return portdao;
    }

    public void setPortdao(PortariaDAO portdao) {
        this.portdao = portdao;
    }

    public Portaria getPortaria() {
        return portaria;
    }

    public void setPortaria(Portaria portaria) {
        this.portaria = portaria;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public List<Portaria> getListaPortaria() {
        return listaPortaria;
    }

    public void setListaPortaria(List<Portaria> listaPortaria) {
        this.listaPortaria = listaPortaria;
    }

    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }
    
    
         
    
     //Funções

    public void criaPort() {
        System.out.println("Funcionando criar..");
        portdao.inserir(portaria);
        
        super.displayInfoMessageToUser("Portaria Cadastrada com Sucesso!");
    }
    
     public  void listandoPortaria(){
        listaPortaria = portdao.listar();
         for (int i = 0; i <listaPortaria.size(); i++) {
            
            System.out.println(listaPortaria.get(i).getNumeroPort());
           /* System.out.println(listaPortaria.get(i).getEmentaPort());
            System.out.println(listaPortaria.get(i).getDataHomologaPort());
            System.out.println(listaPortaria.get(i).getProjeto());
           // System.out.println(listaPortaria.get(i).getFuncionarios());
            System.out.println(listaPortaria.get(i).getEspacoTextoPort());
            System.out.println(listaPortaria.get(i).getVigencia());
             */
         }
     }
     
     
     
     
     
      //skip funçoes do wizard p visualizar dados antes de gerar portaria
    /*
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
    
      public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }  
    }*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.listaFuncionario);
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
        final CadastroPortaria other = (CadastroPortaria) obj;
        if (!Objects.equals(this.listaFuncionario, other.listaFuncionario)) {
            return false;
        }
        return true;
    }
}

    
   