package metier;

import java.util.List;

import javax.ejb.Local;

@Local
public interface IAgenceLocal {
	public Long addClient(Client c);
	public List<Client> getAllClient();
}
