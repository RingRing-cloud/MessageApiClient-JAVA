package be.ringring.message.model.request;

public enum MessageEncoding {

	GSM0338(0),
	UNICODE(8);
	
	private Integer code;
	
	private MessageEncoding(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
	
}
