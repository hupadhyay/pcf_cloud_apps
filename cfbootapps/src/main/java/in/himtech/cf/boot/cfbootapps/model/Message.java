package in.himtech.cf.boot.cfbootapps.model;

import org.springframework.beans.factory.annotation.Value;

public class Message {
	
	@Value("${device.message.sender:himDefault}")
	private String sender;
	
	@Value("${device.message.receiver:himDefault}")
	private String receiver;
	
	@Value("${device.message.payload:himDefault}")
	private String payload;
	
	public Message() {
		super();
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "Message [sender=" + sender + ", receiver=" + receiver + ", payload=" + payload + "]";
	}

}
