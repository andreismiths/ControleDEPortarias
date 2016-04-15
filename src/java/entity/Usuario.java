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
    String SiapeUsuario;   
   
    @Column(name="CPF_Usuario")
    String cpfUsuario;
    
    @Column(name="Senha_Usuario")
    String senhaUsuario;
    
    @Column(name="RG_Usuario")
    String rgUsuario;
    
    @Column(name="Nome_Usuario")
    String nomeUsuario;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="Data_Nascimento_Usuario")
    Date dataNascimUsuario;
    
    @Column(name="Sexo_Usuario")
    String sexoUsuario;
    
    @Column(name="Email_Usuario")
    String emailUsuario;
    
    
    // Getters e Setters

    public String getSiapeUsuario() {
        return SiapeUsuario;
    }

    public void setSiapeUsuario(String SiapeUsuario) {
        this.SiapeUsuario = SiapeUsuario;
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

    public String getRgUsuario() {
        return rgUsuario;
    }

    public void setRgUsuario(String rgUsuario) {
        this.rgUsuario = rgUsuario;
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

    public String getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(String sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
  
}
