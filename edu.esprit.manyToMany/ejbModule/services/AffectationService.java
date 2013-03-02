package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.Affectation;
import persistence.Employee;
import persistence.Project;

/**
 * Session Bean implementation class AffectationService
 */
@Stateless
public class AffectationService implements AffectationServiceRemote {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addAffectation(int idProject, int idEemployee, String role) {

		Affectation affectation = new Affectation(role, entityManager.find(
				Employee.class, idEemployee), entityManager.find(Project.class,
				idProject));
		entityManager.persist(affectation);

	}

	@Override
	public void initDB() {
		Project project = new Project("dwk");
		Employee employee = new Employee("dhia");

		entityManager.persist(employee);
		entityManager.persist(project);

	}

}
