package demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class PatientServiceApplication {

	@Bean
	public CommandLineRunner init(PatientRepository patientRepository) {
		return args -> {
			patientRepository.deleteAll();

			Arrays.asList("reg1", "reg2")
					.forEach(n -> patientRepository
							.save(new Patient(n, String.format("http://details-of-patient-at-%s.com", n),
									String.format("A description for patient with registration %s's", n))));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
	}
}
