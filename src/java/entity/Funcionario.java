package entity;


import com.xpert.faces.conversion.ConverterId;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;


@Entity(name="Funcionario")
public class Funcionario implements Serializable {
    
    @Id
    @ConverterId
    @Column(name="Siape_Usuario")
    Integer siapeUsuario;   
   
    @Column(name="CPF_Usuario")
    String cpfUsuario;
    
    @Column(name="Senha_Usuario")
    String senhaUsuario;
        
    @Column(name="Nome_Usuario")
    String nomeUsuario;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="Data_Nascimento_Usuario")
    Date dataNascimUsuario;
    
    @Column(name="Email_Usuario")
    String emailUsuario;
    
    @Column(name="Tipo_Usuario")
    String tipoUsuario;
    
    @Column(name="Departamento_Funcionario")
    private String departanento;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="Data_Entrada_Funcionario")
    private Date dataEntrada;
    
    @ManyToMany (mappedBy = "funcionarios")
    private List<Portaria> portarias;
    
    @OneToMany
    private List<Funcionario> funcionario;
    
      // getter e setters

    
    
    public Integer getSiapeUsuario() {
        return siapeUsuario;
    }

    public void setSiapeUsuario(Integer siapeUsuario) {
        this.siapeUsuario = siapeUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getDataNascimUsuario() {
        return dataNascimUsuario;
    }

    public void setDataNascimUsuario(Date dataNascimUsuario) {
        this.dataNascimUsuario = dataNascimUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

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

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.siapeUsuario, other.siapeUsuario)) {
            return false;
        }
        return true;
    }
    
    

}
