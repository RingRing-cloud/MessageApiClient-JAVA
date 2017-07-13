package be.ringring.message.model.request;

public enum MessageEncoding {

	GSM0338("Text"),
	UNICODE("Unicode");
	
	private String value;
	
	private MessageEncoding(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
