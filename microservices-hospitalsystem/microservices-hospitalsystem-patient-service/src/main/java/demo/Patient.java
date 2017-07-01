package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue
	private Long id;

	private String registrationId;

	private String href;

	private String description;

	Patient() {
	}

	public Patient(String registrationId, String href, String description) {
		this.registrationId = registrationId;
		this.href = href;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getHref() {
		return href;
	}

	public String getRegistrationId() {
		return registrationId;
	}

}
