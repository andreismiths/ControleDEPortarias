package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name= "Portaria")
public class Portaria implements Serializable {
    
    @ManyToMany
    private List<Funcionario> funcionarios;

    @ManyToMany
    private List<Status> status;
     
   
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    @Column(name="Numero_Portaria")
    private Integer numeroPort;
    
    @Column(name="Ementa_Portaria")
    private String ementaPort;
    
    @Column(name="Data_Homologaçao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataHomologaPort;
  
    @Column(name="Texto_Portaria")
    private String espacoTextoPort;
         
    @Column(name="Vigencia")
    private String vigencia;
    
    @Column(name="Projeto")
    private String projeto;
    
    @Column(name="Assinatura_Portaria")
    private String assinaturaPort;

    //getters e setters

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Status> getStatus() {
        return status;
    }

    public void setStatus(List<Status> status) {
        this.status = status;
    }

    public String getEspacoTextoPort() {
        return espacoTextoPort;
    }

    public void setEspacoTextoPort(String espacoTextoPort) {
        this.espacoTextoPort = espacoTextoPort;
    }

    public String getAssinaturaPort() {
        return assinaturaPort;
    }

    public void setAssinaturaPort(String assinaturaPort) {
        this.assinaturaPort = assinaturaPort;
    }

    public Integer getNumeroPort() {
        return numeroPort;
    }

    public void setNumeroPort(Integer numeroPort) {
        this.numeroPort = numeroPort;
    }

    public String getEmentaPort() {
        return ementaPort;
    }

    public void setEmentaPort(String ementaPort) {
        this.ementaPort = ementaPort;
    }

    public Date getDataHomologaPort() {
        return dataHomologaPort;
    }

    public void setDataHomologaPort(Date dataHomologaPort) {
        this.dataHomologaPort = dataHomologaPort;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    
 
      

}
