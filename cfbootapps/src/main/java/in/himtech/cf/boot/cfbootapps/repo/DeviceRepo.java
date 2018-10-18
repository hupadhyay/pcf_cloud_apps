package in.himtech.cf.boot.cfbootapps.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import in.himtech.cf.boot.cfbootapps.model.Device;

public interface DeviceRepo extends JpaRepository<Device, UUID>{
	
	Device findByName(String name);

}
