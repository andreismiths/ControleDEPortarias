
package Entidade;
/**
 *
 * @author andreismiths
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name= "Usuario")
@Inheritance(strategy = InheritanceType.JOINED) //henrança - serão criadas tabelas separadas para cada um
public class Usuario implements Serializable {
   
    @Id
    @Column(name="Siape_Usuario")
    @NotEmpty        
    Integer SiapeUsuario;
    
    @Id
    @Column(name="CPF_Usuario")
    @NotEmpty        
    Integer cpfUsuario;
    
    @Column(name="Senha_Usuario")
    @NotEmpty 
    Long senhaUsuario;
    
    @Column(name="RG_Usuario")
    @NotEmpty 
    Integer rgUsuario;
    
    @Column(name="Nome_Usuario")
    @NotEmpty 
    String nomeUsuario;
    
    @Column(name="Data_Nascimento_Usuario")
    @NotEmpty 
    Integer dataNascimUsuario;
    
    @Column(name="Sexo_Usuario")
    @NotEmpty 
    String sexoUsuario;
    
    @Column(name="Email_Usuario")
    @NotEmpty 
    String emailUsuario;
    
    
    // Getters e Setters

    public Integer getSiapeUsuario() {
        return SiapeUsuario;
    }

    public void setSiapeUsuario(Integer SiapeUsuario) {
        this.SiapeUsuario = SiapeUsuario;
    }

    public Integer getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(Integer cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public Long getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(Long senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Integer getRgUsuario() {
        return rgUsuario;
    }

    public void setRgUsuario(Integer rgUsuario) {
        this.rgUsuario = rgUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Integer getDataNascimUsuario() {
        return dataNascimUsuario;
    }

    public void setDataNascimUsuario(Integer dataNascimUsuario) {
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
