package client;

interface In{
    public String getName();
    public String getAddress() ;
    public void setName();
    public void setAddress();
}
public  class Place implements In{
    
    private String name;
    private String address;
    private static int[] capacity=new int[4];
    private int price;
    

    public static int getCapacity(int a) {
        return capacity[a];
    }
    
    
    public static void updateCapacity(int n,int a) {
        capacity[a] += n;
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

    @Override
    public void setName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}