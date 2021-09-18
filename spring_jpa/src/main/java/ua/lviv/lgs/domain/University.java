package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Transactional
@Entity
@Table (name="university")
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String accreditation;
	
	@Column (name="amountOfInstitution")
	private int amountOfInstitution;
	
	@Column (name="amountOfStudents")
	private int amountOfStudents;
	
	@Column
	private String adress;

	public University() {
		
	}

	public University(long id, String name, String accreditation, int amountOfInstitution, int amountOfStudents,
			String adress) {
		super();
		this.id = id;
		this.name = name;
		this.accreditation = accreditation;
		this.amountOfInstitution = amountOfInstitution;
		this.amountOfStudents = amountOfStudents;
		this.adress = adress;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccreditation() {
		return accreditation;
	}

	public void setAccreditation(String accreditation) {
		this.accreditation = accreditation;
	}

	public int getAmountOfInstitution() {
		return amountOfInstitution;
	}

	public void setAmountOfInstitution(int amountOfInstitution) {
		this.amountOfInstitution = amountOfInstitution;
	}

	public int getAmountOfStudents() {
		return amountOfStudents;
	}

	public void setAmountOfStudents(int amountOfStudents) {
		this.amountOfStudents = amountOfStudents;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", accreditation=" + accreditation + ", amountOfInstitution="
				+ amountOfInstitution + ", amountOfStudents=" + amountOfStudents + ", adress=" + adress + "]";
	}

	
	
	
	
}
