package net.baccredomatic.baclink.core.api.dto;

public class AuditDetailDTO {

	private String description;
	private String value;
	
	public AuditDetailDTO(String description, String value) {
		this.description = description;
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "AuditDetailDTO [description=" + description + ", value=" + value + "]";
	}
}
