package ec.edu.ups.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entities.Category;

/**
 * Session Bean implementation class CategoryFacade
 */
@Stateless
public class CategoryFacade extends AbstractFacade<Category> {

	@PersistenceContext(unitName = "Factura")
	private EntityManager em;
	
    public CategoryFacade() {
       super(Category.class);
    }

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
