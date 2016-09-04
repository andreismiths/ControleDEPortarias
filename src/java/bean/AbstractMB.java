package bean;



import java.io.Serializable;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FlowEvent;
import util.JSFMessageUtil;

public class AbstractMB implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String KEEP_DIALOG_OPENED = "KEEP_DIALOG_OPENED";

    private boolean skip;
    
    
    
     //skip funçoes do wizard p visualizar dados antes de gerar portaria
    
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
    }
    
    
    public AbstractMB() {
        super();
    }

    protected void displayErrorMessageToUser(String message) {
        JSFMessageUtil messageUtil = new JSFMessageUtil();
        messageUtil.sendErrorMessageToUser(message);
    }

    protected void displayInfoMessageToUser(String message) {
        JSFMessageUtil messageUtil = new JSFMessageUtil();
        messageUtil.sendInfoMessageToUser(message);
    }

    protected void closeDialog() {
        getRequestContext().addCallbackParam(KEEP_DIALOG_OPENED, false);
    }

    protected void keepDialogOpen() {
        getRequestContext().addCallbackParam(KEEP_DIALOG_OPENED, true);
    }

    protected RequestContext getRequestContext() {
        return RequestContext.getCurrentInstance();
    }

    public static Object buscaDaSessao(String key) {
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(key);
    }

    public static void adicionaNaSessao(String key, Object value) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(key, value);
    }

    /**
     * Método para exibição de mensagem de sucesso caso não tenham acontecidos
     * erros no cadastro/edição/busca.
     *
     * @param mensagem
     */
    public void mensagemSucesso(String mensagem) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage("sucesso", new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", mensagem));
    }

    /**
     * Método para exibição de mensagem de atenção caso tenha acontecido algum
     * erro no cadastro/edição/busca.
     *
     * @param mensagem
     */
    public void mensagemAtencao(String mensagem) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage("atencao", new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção!", mensagem));
    }

    /**
     * Método para exibição de mensagem indicando que a lista no formulário de
     * busca está vazia, ou seja, não houveram resultados.
     *
     * @param mensagem
     */
    public void mensagemVazia(String mensagem) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage("vazia", new FacesMessage(FacesMessage.SEVERITY_INFO, "Lista Vazia!", mensagem));
    }

    /**
     * Método para exibição de mensagem de erro caso tenha acontecido algum erro
     * no cadastro/edição/busca.
     *
     * @param mensagem
     */
    public void mensagemErro(String mensagem) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage("erro", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", mensagem));
    }

    public Map<String, String> parametrosDoRequest() {
    	FacesContext context = FacesContext.getCurrentInstance();
    	return context.getExternalContext().getRequestParameterMap();
    }
}
