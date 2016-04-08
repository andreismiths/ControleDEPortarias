package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;


@Entity(name="Funcionario")
public class Funcionario extends Usuario implements Serializable {
    
    
    @Column(name="Departamento_Funcionario")
    private String departanento;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="Data_Entrada_Funcionario")
    private Date dataEntrada;
    
    @ManyToMany (mappedBy = "funcionarios")
    private List<Portaria> portarias;

      public Funcionario() {
        portarias = new ArrayList<Portaria>();
        departanento="";
        
    } 
     // getter e setters

    public String getDepartanento() {
        return departanento;
    }

    public void setDepartanento(String departanento) {
        this.departanento = departanento;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public List<Portaria> getPortarias() {
        return portarias;
    }

    public void setPortarias(List<Portaria> portarias) {
        this.portarias = portarias;
    }
   
    
    
}
