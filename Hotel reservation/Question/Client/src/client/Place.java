package client;

/**
 *
 * @author unknown
 */
public class Place {
    
    private String name;
    private String address;
    
    /*
        get methodes
    */
    
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    /*
        set methodes
    */
    
    public void setName(String s) {
        this.name = s;
    }
    
    public void setAddress(String s) {
        this.address = s;
    }
}