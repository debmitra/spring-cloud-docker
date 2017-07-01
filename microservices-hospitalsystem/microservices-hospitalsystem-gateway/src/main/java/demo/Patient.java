package demo;

public class Patient {

	private Long id;

	private String registrationId;

	private String href;

	private String description;

	Patient() {
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public String getHref() {
		return href;
	}

	@Override
	public String toString() {
		return "Patient{" + "id=" + id + ", href='" + href + '\'' + ", registrationId='" + registrationId + '\''
				+ ", description='" + description + '\'' + '}';
	}

}
