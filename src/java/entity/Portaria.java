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
    
    @Column(name="Projeto")
    private String projeto;
    
    @Column(name="Titulo_Projeto")
    private String titulo;
    
    @Column(name="Faculdade")
    private String faculdade;
    
    @Column(name="Professor_Coordenador")
    private String profCoordenador;
    
    @Column(name="Siape_Coordenador")
    private String siapeCoordenador;
         
    @Column(name="Vigencia_Inicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vigenciaInicio;
    
    @Column(name="Vigencia_Fim")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vigenciaFim;
    
    @Column(name="Colaborador1")
    private String colaborador1;
    
    @Column(name="Colaborador2")
    private String colaborador2;
    
    @Column(name="Colaborador3")
    private String colaborador3;
    
    @Column(name="Status")
    private String status;

    

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {    
        this.funcionarios = funcionarios;
    }

    public Integer getIDPort() {
        return IDPort;
    }

    public void setIDPort(Integer IDPort) {
        this.IDPort = IDPort;
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

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public String getProfCoordenador() {
        return profCoordenador;
    }

    public void setProfCoordenador(String profCoordenador) {
        this.profCoordenador = profCoordenador;
    }

    public String getSiapeCoordenador() {
        return siapeCoordenador;
    }

    public void setSiapeCoordenador(String siapeCoordenador) {
        this.siapeCoordenador = siapeCoordenador;
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

    public String getColaborador1() {
        return colaborador1;
    }

    public void setColaborador1(String colaborador1) {
        this.colaborador1 = colaborador1;
    }

    public String getColaborador2() {
        return colaborador2;
    }

    public void setColaborador2(String colaborador2) {
        this.colaborador2 = colaborador2;
    }

    public String getColaborador3() {
        return colaborador3;
    }

    public void setColaborador3(String colaborador3) {
        this.colaborador3 = colaborador3;
    }

    public String getStatus() {
        return status;
    }

    //getters e setters
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
