package brussels.formation.infrastructure;

import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

import brussels.formation.model.Place;
import brussels.formation.model.PlaceRepository;

/**
 * @author abajramov
 * @since 30/08/2018
 */
@Repository
public class DynamodbPlaceRepository extends DynamodbRepository implements PlaceRepository {
    // -------------------------------------------------------------------------------Constant(s)---
    
    // -----------------------------------------------------------------------------Property(ies)---
    
    // ----------------------------------------------------------------------------Constructor(s)---
    
    // -------------------------------------------------------------------------------Override(s)---
    @Override
    public Place getPlace(String placeId) {
        DynamoDB dynamodb = new DynamoDB(getDynamodbClient());
        Table    table    = dynamodb.getTable("Places");
        Item item = table.getItem("placeId", placeId);
        Place place = null;
        
        if (item != null) {
            place = new Place(item.getString("placeId"), item.getString("municipality_Fr"),
                    item.getString("municipality_Nl"), item.getString("Number"), item.getString("place_name_Fr"),
                    item.getString("place_name_Nl"), item.getString("postalCode"), item.getString("street_Fr"),
                    item.getString("street_Nl"), item.getString("userId"), item.getString("x"), item.getString("y"));
        }
        
        return place;
    }
    
    // ---------------------------------------------------------------------------------Method(s)---
    
    // -----------------------------------------------------------------------Getter(s)/Setter(s)---
}
