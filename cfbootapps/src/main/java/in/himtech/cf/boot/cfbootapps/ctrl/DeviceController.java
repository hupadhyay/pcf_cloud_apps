package in.himtech.cf.boot.cfbootapps.ctrl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.himtech.cf.boot.cfbootapps.model.Device;
import in.himtech.cf.boot.cfbootapps.model.Message;
import in.himtech.cf.boot.cfbootapps.repo.DeviceRepo;

@RestController
public class DeviceController {

	@Autowired
	private DeviceRepo repoDevice;
	
	@PostMapping
	private ResponseEntity<Device> saveDevice(@RequestBody Device device) {
		Device deviceEntity = repoDevice.save(device);
		return new ResponseEntity<Device>(deviceEntity, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/{deviceId}")
	private ResponseEntity<Device> getDevice(@RequestBody String deviceId) {
		Device deviceEntity = repoDevice.getOne(UUID.fromString(deviceId));
		return new ResponseEntity<Device>(deviceEntity, HttpStatus.OK);
	}
	
	@GetMapping(value="/name/{deviceName}")
	private ResponseEntity<Device> getDeviceByName(@RequestBody String deviceName) {
		Device deviceEntity = repoDevice.findByName(deviceName);
		return new ResponseEntity<Device>(deviceEntity, HttpStatus.OK);
	}
	
	@GetMapping
	private ResponseEntity<List<Device>> getAllDevice() {
		List<Device> deviceEntity = repoDevice.findAll();
		return new ResponseEntity<List<Device>>(deviceEntity, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/message}")
	private ResponseEntity<Message> getMessageFromProperty() {
		Message message = new Message();
		return new ResponseEntity<Message>(message, HttpStatus.OK);
	}
	
}
