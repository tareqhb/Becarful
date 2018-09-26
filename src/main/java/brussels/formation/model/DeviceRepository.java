package brussels.formation.model;

import java.util.List;

public interface DeviceRepository {
	List<Device> getDevice(String id);
	List<Device> getLastDevice(String id,String id2);
	List<Device> getAll();

}
