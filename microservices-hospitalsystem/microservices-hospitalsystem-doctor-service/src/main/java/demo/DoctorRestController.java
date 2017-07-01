package demo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{registrationId}/doctors")
public class DoctorRestController {

	@Autowired
	private DoctorRepository doctorRepository;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Doctor> getDoctors(@PathVariable String registrationId) {
		return this.doctorRepository.findDoctorByRegistrationId(registrationId);
	}

	@RequestMapping(value = "/{cardId}", method = RequestMethod.GET)
	public Doctor getDoctor(@PathVariable String registrationId, @PathVariable Long cardId) {
		return this.doctorRepository.findDoctorByRegistrationIdAndId(registrationId, cardId);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Doctor createDoctor(@PathVariable String registrationId, @RequestBody Doctor doctor) {
		return this.doctorRepository.save(new Doctor(registrationId, doctor.getFirstName(), doctor.getLastName(),
				doctor.getEmail(), doctor.getSpeciality()));
	}

}
