package brussels.formation.model;

/**
 * @author abajramov
 * @since 30/08/2018
 */
public class Place {
    // -------------------------------------------------------------------------------Constant(s)---
    
    // -----------------------------------------------------------------------------Property(ies)---
    private String placeId;
    private String municipalityFr;
    private String municipalityNl;
    private String number;
    private String placeNameFr;
    private String planceNameNl;
    private String postalCode;
    private String streetFr;
    private String streetNl;
    private String userId;
    private String x;
    private String y;
    
    // ----------------------------------------------------------------------------Constructor(s)---
    public Place(String placeId, String municipalityFr, String municipalityNl, String number, String placeNameFr,
            String planceNameNl, String postalCode, String streetFr, String streetNl, String userId, String x,
            String y) {
        this.placeId = placeId;
        this.municipalityFr = municipalityFr;
        this.municipalityNl = municipalityNl;
        this.number = number;
        this.placeNameFr = placeNameFr;
        this.planceNameNl = planceNameNl;
        this.postalCode = postalCode;
        this.streetFr = streetFr;
        this.streetNl = streetNl;
        this.userId = userId;
        this.x = x;
        this.y = y;
    }
    
    // -------------------------------------------------------------------------------Override(s)---
    
    // ---------------------------------------------------------------------------------Method(s)---
    
    // -----------------------------------------------------------------------Getter(s)/Setter(s)---
    public String getMunicipalityFr() {
        return municipalityFr;
    }
    
    public void setMunicipalityFr(String municipalityFr) {
        this.municipalityFr = municipalityFr;
    }
    
    public String getMunicipalityNl() {
        return municipalityNl;
    }
    
    public void setMunicipalityNl(String municipalityNl) {
        this.municipalityNl = municipalityNl;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getPlaceNameFr() {
        return placeNameFr;
    }
    
    public void setPlaceNameFr(String placeNameFr) {
        this.placeNameFr = placeNameFr;
    }
    
    public String getPlanceNameNl() {
        return planceNameNl;
    }
    
    public void setPlanceNameNl(String planceNameNl) {
        this.planceNameNl = planceNameNl;
    }
    
    public String getPlaceId() {
        return placeId;
    }
    
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
    
    public String getPostalCode() {
        return postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getStreetFr() {
        return streetFr;
    }
    
    public void setStreetFr(String streetFr) {
        this.streetFr = streetFr;
    }
    
    public String getStreetNl() {
        return streetNl;
    }
    
    public void setStreetNl(String streetNl) {
        this.streetNl = streetNl;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getX() {
        return x;
    }
    
    public void setX(String x) {
        this.x = x;
    }
    
    public String getY() {
        return y;
    }
    
    public void setY(String y) {
        this.y = y;
    }
}
