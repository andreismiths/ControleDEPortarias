package entity;

import java.io.Serializable;
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
    
    @Column(name="Vigente")
    private String vigente;
    
    @Column(name="Expirada")
    private String expirada;
    
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
    
}
