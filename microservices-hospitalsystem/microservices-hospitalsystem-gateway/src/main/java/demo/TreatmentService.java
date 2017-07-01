package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import reactor.Environment;
import reactor.rx.Stream;
import reactor.rx.Streams;

@Component
public class TreatmentService {

	@Autowired
	private Environment environment;

	@Autowired
	private DoctorClient doctorClient;

	@Autowired
	private PatientClient patientClient;

	public Stream<Patient> getPatients(String registrationId) {
		return Streams.<Patient> create(patient -> {
			this.patientClient.getPatients(registrationId).forEach(patient::onNext);
			patient.onComplete();
		}).dispatchOn(this.environment, Environment.cachedDispatcher()).log("patients");
	}

	public Stream<Doctor> getDoctors(String registrationId) {
		return Streams.<Doctor> create(doctor -> {
			this.doctorClient.getDoctors(registrationId).forEach(doctor::onNext);
			doctor.onComplete();
		}).dispatchOn(this.environment, Environment.cachedDispatcher()).log("doctors");
	}

	public Stream<Treatment> getTreatment(String registrationId, Stream<Doctor> doctors, Stream<Patient> patients) {
		return Streams.zip(doctors.buffer(), patients.buffer(),
				tuple -> new Treatment(registrationId, tuple.getT1(), tuple.getT2()));
	}
}
