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


@Entity(name="Administrador")
@PrimaryKeyJoinColumn(name="SiapeUsuario" + "cpfUsuario")
public class Administrador  extends Usuario implements Serializable {
    
    @Id //mostra que não pode ser id pq se não terá vários ids
    @Column(name="Siape_Usuario")
    @NotEmpty 
    Integer idAdm;
}
