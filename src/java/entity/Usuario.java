package entity;

/**
 *
 * @author andreismiths
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name= "Usuario")
@Inheritance(strategy = InheritanceType.JOINED) //henrança - serão criadas tabelas separadas para cada um. InheritanceType.JOINED, onde cada classe terá uma tabela
public class Usuario implements Serializable {
   
       
    @Id
    @Column(name="Siape_Usuario")
    String siapeUsuario;   
   
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
    
    // Getters e Setters

    public String getSiapeUsuario() {
        return siapeUsuario;
    }

    public void setSiapeUsuario(String siapeUsuario) {
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
  
}
