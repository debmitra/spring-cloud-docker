package demo;

import java.util.Collection;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("patient-service")
public interface PatientClient {

	@RequestMapping(method = RequestMethod.GET, value = "/{registrationId}/patients")
	public Collection<Patient> getPatients(@PathVariable("registrationId") String registrationId);

}
