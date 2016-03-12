
package br.com.usuario.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.hibernate.validator.constraints.NotEmpty;

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
    @NotEmpty
    private Long idStatus;
    
    @Column(name="Pendente")
    @NotEmpty
    private String pendente;
    
    @Column(name="Regovada")
    @NotEmpty
    private String revogada;
    
    @Column(name="Aprovada")
    @NotEmpty
    private String aprovada;
    
    @Column(name="Finalizada")
    @NotEmpty
    private String finalizada;

 // getters e setters

    public Long getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Long idStatus) {
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
