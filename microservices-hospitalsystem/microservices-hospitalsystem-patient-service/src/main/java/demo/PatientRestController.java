package demo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{registrationId}/patients")
public class PatientRestController {

	@Autowired
	private PatientRepository patientRepository;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Patient> getPatients(@PathVariable String registrationId) {
		return this.patientRepository.findPatientByRegistrationId(registrationId);
	}

	@RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
	public Patient getPatient(@PathVariable String registrationId, @PathVariable Long roomId) {
		return this.patientRepository.findPatientByRegistrationIdAndId(registrationId, roomId);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Patient createPatient(@PathVariable String registrationId, @RequestBody Patient patient) {
		Patient patientInstance = new Patient(registrationId, patient.getHref(), patient.getDescription());
		return this.patientRepository.save(patientInstance);
	}

}
