package demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class DoctorServiceApplication {

	@Bean
	public CommandLineRunner init(DoctorRepository doctorRepository) {
		return args -> {
			doctorRepository.deleteAll();
			Arrays.asList("reg1,reg2".split(",")).forEach(registrationId -> {
				Arrays.asList(
						"Stéphane,Maldini,Cardiologist;Dave,Syer,Orthopaedic;Juergen,Hoeller,Nephrologist;Mark,Fisher,Dentist;Rob,Winch,Neurologist;Arjen,Poutsma,Opthalmologist"
								.split(";"))
						.stream().map(name -> name.split(","))
						.map(firstLastName -> new Doctor(registrationId, firstLastName[0], firstLastName[1],
								firstLastName[0].toLowerCase() + "@email.com", firstLastName[2]))
						.forEach(doctorRepository::save);
			});
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DoctorServiceApplication.class, args);
	}

}
