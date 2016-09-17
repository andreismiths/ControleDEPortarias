package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
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
      
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    @Column(name="ID_Portaria")
    private Integer IDPort;
    
    @Column(name="Numero_Portaria")
    private String numeroPort;
    
    @Column(name="Ementa_Portaria")
    private String ementaPort;
    
    @Column(name="Data_Homologaçao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataHomologaPort;
  
    @Column(name="Resolve_Port")
    private String resolve;
         
    @Column(name="Vigencia_Inicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vigenciaInicio;
    
    @Column(name="Vigencia_Fim")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vigenciaFim;
    
    @Column(name="Projeto")
    private String projeto;
    
    @Column(name="Status")
    private String status;
    
    @Column(name="Assinatura_Portaria")
    private String assinaturaPort;

    //getters e setters

    public Integer getIDPort() {
        return IDPort;
    }

    public void setIDPort(Integer IDPort) {
        this.IDPort = IDPort;
    }
        
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getResolve() {
        return resolve;
    }

    public void setResolve(String resolve) {
        this.resolve = resolve;
    }

    public String getAssinaturaPort() {
        return assinaturaPort;
    }

    public void setAssinaturaPort(String assinaturaPort) {
        this.assinaturaPort = assinaturaPort;
    }

    public String getNumeroPort() {
        return numeroPort;
    }

    public void setNumeroPort(String numeroPort) {
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

    public Date getVigenciaInicio() {
        return vigenciaInicio;
    }

    public void setVigenciaInicio(Date vigenciaInicio) {
        this.vigenciaInicio = vigenciaInicio;
    }

    public Date getVigenciaFim() {
        return vigenciaFim;
    }

    public void setVigenciaFim(Date vigenciaFim) {
        this.vigenciaFim = vigenciaFim;
    }

    
    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.IDPort);
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
        final Portaria other = (Portaria) obj;
        if (!Objects.equals(this.IDPort, other.IDPort)) {
            return false;
        }
        return true;
    }

    
    
 
}
