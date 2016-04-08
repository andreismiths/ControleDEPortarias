package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;


@Entity(name="Administrador")
public class Administrador  extends Usuario implements Serializable {
    
    //mostra que não pode ser id pq se não terá vários ids
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ultimoLogin;
    
    
    public Administrador(){
        
    }
    //Get e Set

    public Date getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(Date ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }


    
    
}
