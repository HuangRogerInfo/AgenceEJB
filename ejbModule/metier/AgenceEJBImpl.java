package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * EJB Session
 * @author huang
 *
 */
@Stateless(name="AGENCE")
public class AgenceEJBImpl implements IAgenceLocal, IAgenceRemote {
	@PersistenceContext(unitName ="UP_SQL")
	private EntityManager em;
	@Override
	public Long addClient(Client c) {
		// TODO Auto-generated method stub
		em.persist(c);
		return c.getIdClient();
	}

	@Override
	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select c from Client c");
		return req.getResultList();
	}
}
