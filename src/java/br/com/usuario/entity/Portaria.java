/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.usuario.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name= "Portaria")
public class Portaria implements Serializable {
    
    @ManyToMany
    private List<Funcionario> funcionarios;

    @ManyToMany(mappedBy = "portarias")
    private List<Status> status;
   
   
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    @Column(name="Codigo_Portaria")
    private Long codigoPort;
    
    @Column(name="Protocolo_Portaria")
    @NotEmpty
    private Integer protocoloPort;
    
    @Column(name="Data_Inicio_Portaria")
    @NotEmpty
    private Integer dataInicioPort;
    
    @Column(name="Data_Fim_Portaria")
    @NotEmpty
    private Integer dataFimPort;
    
    @Column(name="Ano_Homologacao_Portaria")
    @NotEmpty
    private Integer anoHomologPort;
    
    @Column(name="Texto_Portaria")
    @NotEmpty
    private String espacoTextoPort;
    
    @Column(name="Status_Portaria")
    @NotEmpty
    private String statusPort;
     
    @Column(name="Assinatura_Portaria")
    @NotEmpty
    private String assinaturaPort;

  

    // Getters e Setters

    public Long getCodigoPort() {
        return codigoPort;
    }

    public void setCodigoPort(Long codigoPort) {
        this.codigoPort = codigoPort;
    }

    public Integer getProtocoloPort() {
        return protocoloPort;
    }

    public void setProtocoloPort(Integer protocoloPort) {
        this.protocoloPort = protocoloPort;
    }

    public Integer getDataInicioPort() {
        return dataInicioPort;
    }

    public void setDataInicioPort(Integer dataInicioPort) {
        this.dataInicioPort = dataInicioPort;
    }

    public Integer getDataFimPort() {
        return dataFimPort;
    }

    public void setDataFimPort(Integer dataFimPort) {
        this.dataFimPort = dataFimPort;
    }

    public Integer getAnoHomologPort() {
        return anoHomologPort;
    }

    public void setAnoHomologPort(Integer anoHomologPort) {
        this.anoHomologPort = anoHomologPort;
    }

    public String getEspacoTextoPort() {
        return espacoTextoPort;
    }

    public void setEspacoTextoPort(String espacoTextoPort) {
        this.espacoTextoPort = espacoTextoPort;
    }

    public String getEstadoPort() {
        return statusPort;
    }

    public void setEstadoPort(String estadoPort) {
        this.statusPort = estadoPort;
    }
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public void setFuncioanrios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getStatusPort() {
        return statusPort;
    }

    public void setStatusPort(String statusPort) {
        this.statusPort = statusPort;
    }
  
    public String getAssinaturaPort() {
        return assinaturaPort;
    }

    public void setAssinaturaPort(String assinaturaPort) {
        this.assinaturaPort = assinaturaPort;
    }

}
