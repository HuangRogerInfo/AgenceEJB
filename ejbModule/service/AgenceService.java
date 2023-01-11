package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.IAgenceLocal;
import metier.Client;


/**
 * Stateless = une instance pour tous les clients / Stateful = une instance pour chaque client
 * @author huang
 *
 */
@Stateless
@WebService
public class AgenceService {
	//Annotation pour l'injection, cherche l'implémentation et l'injecte
	@EJB
	private IAgenceLocal metier;
	
	//Une méthode web service doit être annoté de web methode
	@WebMethod
	public List<Client> consulterClients(){
		return metier.getAllClient();
	}
	@WebMethod(operationName="ajouterClient")
	public long addClient(@WebParam(name="p")String prenom, @WebParam(name="n")String nom) {
		Client c = new Client(nom, prenom);
		return metier.addClient(c);
	}
}
