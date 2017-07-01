package demo;

import java.util.Collection;

public class Treatment {

	private String registrationId;

	private Collection<Doctor> doctors;

	private Collection<Patient> patients;

	public Treatment(String registrationId, Collection<Doctor> doctors, Collection<Patient> patients) {
		this.registrationId = registrationId;
		this.doctors = doctors;
		this.patients = patients;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public Collection<Doctor> getDoctors() {
		return doctors;
	}

	public Collection<Patient> getPatients() {
		return patients;
	}

	@Override
	public String toString() {
		return "Treatment{" + "registrationId='" + registrationId + '\'' + ", patients=" + patients + ", doctors="
				+ doctors + '}';
	}

}
