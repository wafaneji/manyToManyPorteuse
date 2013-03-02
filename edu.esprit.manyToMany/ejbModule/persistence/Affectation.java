package persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Affectation
 * 
 */
@Entity
public class Affectation implements Serializable {

	private AffectationPK affectationPK;
	private String role;

	private Employee employee;
	private Project project;
	private static final long serialVersionUID = 1L;

	public Affectation() {
		super();
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@EmbeddedId
	public AffectationPK getAffectationPK() {
		return affectationPK;
	}

	public void setAffectationPK(AffectationPK affectationPK) {
		this.affectationPK = affectationPK;
	}

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idEmp", referencedColumnName = "idEmployee", insertable = false, updatable = false)
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idProj", referencedColumnName = "idProject", insertable = false, updatable = false)
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Affectation(String role, Employee employee, Project project) {
		super();
		this.affectationPK = new AffectationPK(employee.getIdEmployee(),
				project.getIdProject());
		this.role = role;
		this.employee = employee;
		this.project = project;
	}

}
