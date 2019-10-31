
package Re;
interface In{
    public String getName();
    public String getAddress() ;
    public void setName(String s);
    public void setAddress(String s);
}
public  class Place implements In{
    
    private String name;
    private String address;
    private int capacity=0;
    private int price;
    

    public int getCapacity() {
        return capacity;
    }
    
    
    public void updateCapacity(int n) {
        capacity += n;
    }
     public  int getPrice() {
        return price;
    }
    
    
    public  void setPrice(int n) {
        price= n;
    }
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    
    public void setName(String s) {
        this.name = s;
    }
    
    public void setAddress(String s) {
        this.address = s;
    }

}