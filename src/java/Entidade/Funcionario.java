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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;


@Entity(name="Funcionario")
@PrimaryKeyJoinColumn(name="SiapeUsuario" + "cpfUsuario")
public class Funcionario extends Usuario {
    
    @Id
    @Column(name="Siape_Usuario")
    @NotEmpty 
    Integer idFunci;
}
