package demo;

public class Doctor {

	private Long id;

	private String registrationId;

	private String firstName;

	private String lastName;

	private String email;

	private String speciality;

	public Doctor() {
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

	@Override
	public String toString() {
		return "Doctor{" + "id=" + id + ", speciality='" + speciality + '\'' + ", registrationId='" + registrationId
				+ '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email
				+ '\'' + '}';
	}

}
