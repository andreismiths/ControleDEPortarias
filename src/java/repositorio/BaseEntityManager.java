package repositorio;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless 
public class BaseEntityManager {
    
    @PersistenceContext(unitName = "ControledePortarias")
    private EntityManager entityManager;
    
    @Produces
    @RequestScoped
    public EntityManager getEntityManager() {
	return entityManager;
    }
}
