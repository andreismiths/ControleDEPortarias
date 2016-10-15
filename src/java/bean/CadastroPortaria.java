package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entity.Portaria;
import dao.PortariaDAO;
import entity.Funcionario;
import java.util.List;
import javax.inject.Inject;
import relatorio.Relatorio;

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
        
    private Funcionario FuncionarioSelecionado;
    
    
//Getters e Setters

    public Funcionario getFuncionarioSelecionado() {
        return FuncionarioSelecionado;
    }

    public void setFuncionarioSelecionado(Funcionario FuncionarioSelecionado) {
        this.FuncionarioSelecionado = FuncionarioSelecionado;
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

        
    
     //Funções
    
     public void gerarRelatorioAction() {
        Relatorio relatorio = new Relatorio();
        relatorio.getRelatorio();
    }

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
     
 

   
}

    
   