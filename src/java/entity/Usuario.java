package entity;

/**
 *
 * @author andreismiths
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name= "Usuario")
@Inheritance(strategy = InheritanceType.JOINED) //henrança - serão criadas tabelas separadas para cada um. InheritanceType.JOINED, onde cada classe terá uma tabela
public class Usuario implements Serializable {
   
    public Usuario(){
        SiapeUsuario="";
        cpfUsuario="";
        senhaUsuario="";
        rgUsuario="";
        nomeUsuario="";
        dataNascimUsuario="";
        sexoUsuario="";
        emailUsuario="";
    }
      
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
    
    @Column(name="Data_Nascimento_Usuario")
    String dataNascimUsuario;
    
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

    public String getDataNascimUsuario() {
        return dataNascimUsuario;
    }

    public void setDataNascimUsuario(String dataNascimUsuario) {
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

    
/*
    //equals e hash code;
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.SiapeUsuario);
        hash = 47 * hash + Objects.hashCode(this.cpfUsuario);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.SiapeUsuario, other.SiapeUsuario)) {
            return false;
        }
        return Objects.equals(this.cpfUsuario, other.cpfUsuario);
    }
    */
    
    
}
