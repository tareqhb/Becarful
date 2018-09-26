package brussels.formation.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import brussels.formation.model.Device;
import brussels.formation.model.DeviceRepository;


@Component
public class DeviceAction {
	 
    // -----------------------------------------------------------------------------Property(ies)---
    private DeviceRepository deviceRepository;
    
    // ----------------------------------------------------------------------------Constructor(s)---
    @Autowired
    public DeviceAction(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }
    
    // -------------------------------------------------------------------------------Override(s)---
    
    // ---------------------------------------------------------------------------------Method(s)---
    public List<Device> getDevice(String id) {
        return deviceRepository.getDevice(id);
    }
    
    
    public List<Device> getLastDevice(String id,String id2) {
        return deviceRepository.getLastDevice(id,id2);
    }
    
    public List<Device> getAll() {
        return deviceRepository.getAll();
    }
    
    // -----------------------------------------------------------------------Getter(s)/Setter(s)---
}
