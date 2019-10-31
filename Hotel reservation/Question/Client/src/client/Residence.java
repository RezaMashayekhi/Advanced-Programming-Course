package client;

/**
 *
 * @author unknown
 */
public class Residence extends Place {
    
    private static int capacity;
    
    /*
        get methodes
    */
    
    public static int getCapacity() {
        return capacity;
    }
    
    /*
        methode to update capacity after reservation
    */
    
    public static void updateCapacity(int n) {
        capacity += n;
    }
}
