package persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class AffectationPK implements Serializable {

	private int idEmp;
	private int idProj;

	public int getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}

	public int getIdProj() {
		return idProj;
	}

	public void setIdProj(int idProj) {
		this.idProj = idProj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmp;
		result = prime * result + idProj;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AffectationPK other = (AffectationPK) obj;
		if (idEmp != other.idEmp)
			return false;
		if (idProj != other.idProj)
			return false;
		return true;
	}

	public AffectationPK() {
		// TODO Auto-generated constructor stub

	}

	public AffectationPK(int idEmp, int idProj) {
		super();
		this.idEmp = idEmp;
		this.idProj = idProj;
	}
}
