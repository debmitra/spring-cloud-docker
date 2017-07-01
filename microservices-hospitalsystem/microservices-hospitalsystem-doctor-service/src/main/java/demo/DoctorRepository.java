package demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	List<Doctor> findDoctorByRegistrationId(String registrationId);

	Doctor findDoctorByRegistrationIdAndId(String registrationId, Long id);
}
