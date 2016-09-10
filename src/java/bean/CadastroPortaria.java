package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entity.Portaria;
import dao.PortariaDAO;
import java.util.List;
import javax.inject.Inject;
import org.primefaces.event.FlowEvent;

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
    
    private boolean skip;
    //Getters e Setters

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
    
    
       
    
     //Funções

    public void criaPort() {
        System.out.println("Funcionando criar..");
        portdao.inserir(portaria);
        
        super.displayInfoMessageToUser("Portaria Cadastrada com Sucesso!");
    }
    
     public  void listandoPortaria(){
        listaPortaria = portdao.listar();
         for (int i = 0; i <listaPortaria.size(); i++) {
            
            // System.out.println(listaPortaria.get(i).getFuncionarios());
             System.out.println(listaPortaria.get(i).getEspacoTextoPort());
             
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
}

    
   