package in.himtech.cf.boot.cfbootapps.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "DEVICE_TABLE", catalog = "test")
public class Device {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	@Column(name="DEVICE_ID")
	private UUID deviceId;

	@Column(name="DEVICE_NAME")
	private String name;

	@Column(name="PROTOCOL")
	private String protocol;

	public UUID getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(UUID deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", name=" + name + ", protocol=" + protocol + "]";
	}
}
