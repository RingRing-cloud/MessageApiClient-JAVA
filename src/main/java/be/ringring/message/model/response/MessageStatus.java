package be.ringring.message.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * StatusMessage is the entity who contains data for the status of one message.
**/

public class MessageStatus {
	
	
	@JsonProperty("MessageId")
	private String messageId;
	
	@JsonProperty("Reference")
	private String reference;
	
	@JsonProperty("StatusCode")
	private String statusCode;
	
	@JsonProperty("StatusDescription")
	private String statusDescription;
		
	@JsonProperty("TimeScheduled")
	private String timeScheduled;
	
	@JsonProperty("TimeSubmitted")
	private String timeSubmitted;
	
	@JsonProperty("DeliveryTime")
	private String deliveryTime;
	
	@JsonProperty("Country")
	private String country;
	
	@JsonProperty("ResultCode")
	private int resultCode;
	
	@JsonProperty("ResultDescription")
	private String resultDescription;
	
	@JsonProperty("From")
	private String from;
	
	@JsonProperty("To")
	private String to;
	
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("MessageEncoding")
	private String messageEncoding;

	@JsonProperty("NumberOfParts")
	private int numberOfParts;

	@JsonProperty("NumberOfChars")
	private int numberOfChars;
	
	
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getTimeSubmitted() {
		return timeSubmitted;
	}

	public void setTimeSubmitted(String timeSubmitted) {
		this.timeSubmitted = timeSubmitted;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDescription() {
		return resultDescription;
	}

	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}

	public String getTimeScheduled() {
		return timeScheduled;
	}

	public void setTimeScheduled(String timeScheduled) {
		this.timeScheduled = timeScheduled;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMessageEncoding() {
		return messageEncoding;
	}

	public void setMessageEncoding(String messageEncoding) {
		this.messageEncoding = messageEncoding;
	}

	public int getNumberOfParts() {
		return numberOfParts;
	}

	public void setNumberOfParts(int numberOfParts) {
		this.numberOfParts = numberOfParts;
	}

	public int getNumberOfChars() {
		return numberOfChars;
	}

	public void setNumberOfChars(int numberOfChars) {
		this.numberOfChars = numberOfChars;
	}
	
	
}
