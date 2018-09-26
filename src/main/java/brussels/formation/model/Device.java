package brussels.formation.model;

public class Device {
	
	private String deviceId;
    private String date;
    private String Proximity;
    private String street;
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProximity() {
		return Proximity;
	}
	public void setProximity(String proximity) {
		Proximity = proximity;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", date=" + date + ", Proximity=" + Proximity + "]";
	}
	public Device(String deviceId, String date, String proximity) {
		super();
		this.deviceId = deviceId;
		this.date = date;
		Proximity = proximity;
		this.street  =  "102, Rue de la loi 1000 Bruxelles " ;
	}
	
    
    

}
