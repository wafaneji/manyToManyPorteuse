package services;

import javax.ejb.Remote;

@Remote
public interface AffectationServiceRemote {

	public void addAffectation(int idProject, int idEemployee, String role);

	public void initDB();

}
