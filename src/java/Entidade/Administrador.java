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


@Entity(name="Administrador")
@PrimaryKeyJoinColumn(name="SiapeUsuario" + "cpfUsuario")
public class Administrador  extends Usuario implements Serializable {
    
    //mostra que não pode ser id pq se não terá vários ids
    @Column(name="Siape_Usuario")
    @NotEmpty 
    Integer idAdm;
    
    
        // Getters e Setters

    public Integer getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(Integer idAdm) {
        this.idAdm = idAdm;
    }
    
    
}
