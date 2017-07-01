package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Doctor {

	@Id
	@GeneratedValue
	private Long id;

	private String registrationId;

	private String firstName;

	private String lastName;

	private String email;

	private String speciality;

	public Doctor() {
	}

	public Doctor(String registrationId, String firstName, String lastName, String email, String speciality) {
		this.registrationId = registrationId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.speciality = speciality;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public String getSpeciality() {
		return speciality;
	}

}
