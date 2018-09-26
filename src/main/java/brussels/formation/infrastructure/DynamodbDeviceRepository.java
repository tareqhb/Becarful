package brussels.formation.infrastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.ScanFilter;
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

import brussels.formation.model.Device;
import brussels.formation.model.DeviceRepository;

@Repository
public class DynamodbDeviceRepository extends DynamodbRepository implements DeviceRepository {

	@Override
	public List<Device> getDevice(String id) {
		List<Device> devices = new ArrayList<>();

		DynamoDB dynamodb = new DynamoDB(getDynamodbClient());
		Table table = dynamodb.getTable("Team4");
		// Item item = table.getItem("deviceId", id);
		ItemCollection<ScanOutcome> scan = table.scan();

		scan.forEach(item -> { if(item.getString("deviceId").equals(id)) 
									devices
				.add(new Device(item.getString("deviceId"), item.getString("date"), item.getString("Proximity"))) ;
									});

//        Device device = null;

//        if (item != null) {
//            device = new Device(item.getString("deviceId"), item.getString("date"),
//                    item.getString("Proximity"));
//        }
//        
		return devices;
	}

	@Override
	public List<Device> getLastDevice(String id,String id2) {
		List<Device> devices = new ArrayList<>();
		List<Device> devices2 = new ArrayList<>();
		List<Device> devicesFinal = new ArrayList<>();

		DynamoDB dynamodb = new DynamoDB(getDynamodbClient());
		Table table = dynamodb.getTable("Team4");
		
		ItemCollection<ScanOutcome> scan = table.scan();

		scan.forEach(item -> { if(item.getString("deviceId").equals(id)) 
			devices
.add(new Device(item.getString("deviceId"), item.getString("date"), item.getString("Proximity"))) ;
			});
		scan.forEach(item -> { if(item.getString("deviceId").equals(id2)) 
			devices2
.add(new Device(item.getString("deviceId"), item.getString("date"), item.getString("Proximity"))) ;
			});
		devicesFinal.add(devices.get(devices.size()-1))  ;
		devicesFinal.add(devices2.get(devices2.size()-1))  ;
		return devicesFinal;
	}

	@Override
	public List<Device> getAll() {
		
		
		List<Device> devices = new ArrayList<>();


		DynamoDB dynamodb = new DynamoDB(getDynamodbClient());
		Table table = dynamodb.getTable("Team4");
		
		ItemCollection<ScanOutcome> scan = table.scan();

		scan.forEach(item -> 
			devices
					.add(new Device(item.getString("deviceId"), item.getString("date"), item.getString("Proximity")))) ;
			
		
		return devices;
	}

	// ---------------------------------------------------------------------------------Method(s)---

	// -----------------------------------------------------------------------Getter(s)/Setter(s)---
}
