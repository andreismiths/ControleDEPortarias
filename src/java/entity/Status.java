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

/**
 *
 * @author andreismiths
 */

@Entity(name="Status")
public class Status implements Serializable {

    @ManyToMany(mappedBy = "status")
    private List<Portaria> portarias;
      
    
    @Id
    @Column(name="ID_Status")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idStatus;
    
    @Column(name="Pendente")
    private String pendente;
    
    @Column(name="Regovada")
    private String revogada;
    
    @Column(name="Aprovada")
    private String aprovada;
    
    @Column(name="Finalizada")
    private String finalizada;

 // getters e setters

    public List<Portaria> getPortarias() {
        return portarias;
    }

    public void setPortarias(List<Portaria> portarias) {
        this.portarias = portarias;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getPendente() {
        return pendente;
    }

    public void setPendente(String pendente) {
        this.pendente = pendente;
    }

    public String getRevogada() {
        return revogada;
    }

    public void setRevogada(String revogada) {
        this.revogada = revogada;
    }

    public String getAprovada() {
        return aprovada;
    }

    public void setAprovada(String aprovada) {
        this.aprovada = aprovada;
    }

    public String getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(String finalizada) {
        this.finalizada = finalizada;
    }
    
}
