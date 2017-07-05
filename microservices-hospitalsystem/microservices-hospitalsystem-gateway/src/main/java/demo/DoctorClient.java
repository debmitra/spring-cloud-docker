package demo;

import java.util.Collection;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("doctor")
public interface DoctorClient {

	@RequestMapping(method = RequestMethod.GET, value = "/{registrationId}/doctors")
	Collection<Doctor> getDoctors(@PathVariable("registrationId") String registrationId);

}
