package metier;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface IAgenceRemote {
	public Long addClient(Client c);
	public List<Client> getAllClient();
}
