package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "Portaria")
public class Portaria implements Serializable {
    
    @ManyToMany
    private List<Funcionario> funcionarios;

    @ManyToMany
    private List<Status> status;
   
    public Portaria() {
        funcionarios = new ArrayList<Funcionario>();
        status = new ArrayList<Status>();
        protocoloPort="";
        dataInicioPort="";
        dataFimPort="";
        anoHomologPort="";
        espacoTextoPort="";
        assinaturaPort="";
        estadoPort="";
    }
    
   
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    @Column(name="Codigo_Portaria")
    private Integer codigoPort;
    
    @Column(name="Protocolo_Portaria")
    private String protocoloPort;
    
    @Column(name="Data_Inicio_Portaria")
    private String dataInicioPort;
    
    @Column(name="Data_Fim_Portaria")
    private String dataFimPort;
    
    @Column(name="Ano_Homologacao_Portaria")
    private String anoHomologPort;
    
    @Column(name="Texto_Portaria")
    private String espacoTextoPort;
         
    @Column(name="Assinatura_Portaria")
    private String assinaturaPort;
    
    @Column(name="Estado_Portaria")
    private String estadoPort;

  

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

    public Integer getCodigoPort() {
        return codigoPort;
    }

    public void setCodigoPort(Integer codigoPort) {
        this.codigoPort = codigoPort;
    }

    public String getProtocoloPort() {
        return protocoloPort;
    }

    public void setProtocoloPort(String protocoloPort) {
        this.protocoloPort = protocoloPort;
    }

    public String getDataInicioPort() {
        return dataInicioPort;
    }

    public void setDataInicioPort(String dataInicioPort) {
        this.dataInicioPort = dataInicioPort;
    }

    public String getDataFimPort() {
        return dataFimPort;
    }

    public void setDataFimPort(String dataFimPort) {
        this.dataFimPort = dataFimPort;
    }

    public String getAnoHomologPort() {
        return anoHomologPort;
    }

    public void setAnoHomologPort(String anoHomologPort) {
        this.anoHomologPort = anoHomologPort;
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

    public String getEstadoPort() {
        return estadoPort;
    }

    public void setEstadoPort(String estadoPort) {
        this.estadoPort = estadoPort;
    }
    
    
}
