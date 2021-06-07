package ec.edu.ups.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entities.Province;

/**
 * Session Bean implementation class CountryFacade
 */
@Stateless
public class ProvinceFacade extends AbstractFacade<Province>{

    @PersistenceContext(unitName = "Factura")
	private EntityManager em;
    
	public ProvinceFacade() {
		super(Province.class);
    }

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	

}
