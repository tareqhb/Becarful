package brussels.formation.api;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import brussels.formation.application.DeviceAction;

import brussels.formation.model.Device;


@RestController("/devices")
//@RequestMapping()
@CrossOrigin(origins = "*")
public class DeviceController {
	 // -----------------------------------------------------------------------------Property(ies)---
    private final DeviceAction deviceAction;
    // ----------------------------------------------------------------------------Constructor(s)---
    @Autowired
    public DeviceController(DeviceAction deviceAction) {
        this.deviceAction = deviceAction;
    }
    
    // -------------------------------------------------------------------------------Override(s)---
    
    // ---------------------------------------------------------------------------------Method(s)---
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Device> getDevice(HttpServletResponse response, @RequestParam("deviceId") String deviceId) {
        List<Device> device = deviceAction.getDevice(deviceId);
        
        if (device == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
        
        return device;
    }
    
    
    @GetMapping(path = "/lastDevice", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Device> getLastDevice(HttpServletResponse response,  @RequestParam("deviceId") String deviceId ,@RequestParam("deviceId2") String deviceId2) {
    	List<Device> device = deviceAction.getLastDevice(deviceId,deviceId2);
        
        if (device == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
      
        
        return device;
    }
    
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Device> getAll(HttpServletResponse response) {
       List<Device> device = deviceAction.getAll();
        
        if (device == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
       
        return device;
    }
    
    
    // -----------------------------------------------------------------------Getter(s)/Setter(s)---
}
