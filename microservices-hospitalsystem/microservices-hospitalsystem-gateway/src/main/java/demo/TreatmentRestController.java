package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import reactor.rx.Stream;

@RestController
public class TreatmentRestController {

	@Autowired
	private TreatmentService treatmentService;

	@RequestMapping("/{registrationId}/treatment")
	public DeferredResult<Treatment> passport(@PathVariable String registrationId) {
		DeferredResult<Treatment> treatmentResult = new DeferredResult<>();
		Stream<Patient> patientDetails = this.treatmentService.getPatients(registrationId);
		Stream<Doctor> doctorDetails = this.treatmentService.getDoctors(registrationId);
		this.treatmentService.getTreatment(registrationId, doctorDetails, patientDetails)
				.consume(treatmentResult::setResult);

		return treatmentResult;
	}

}
