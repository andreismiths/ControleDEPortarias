package Entidade;

/**
 *
 * @author andreismiths
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.validator.constraints.NotEmpty;


@Entity(name="Funcionario")
@PrimaryKeyJoinColumn(name="SiapeUsuario" + "cpfUsuario")
public class Funcionario extends Usuario implements Serializable {
       
    @Column(name="Siape_Usuario")
    @NotEmpty 
    Integer idFunci;
    
    // Getters e Setters

    public Integer getIdFunci() {
        return idFunci;
    }

    public void setIdFunci(Integer idFunci) {
        this.idFunci = idFunci;
    }

    
}
