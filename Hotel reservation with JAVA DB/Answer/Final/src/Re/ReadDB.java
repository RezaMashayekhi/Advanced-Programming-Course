
package Re;

import java.sql.*;
import java.util.*;

public class ReadDB {
    ArrayList<Residence> r; 
    public ReadDB(ArrayList<Residence> p) {
        r = p;
        for(int i=0 ; i<2 ; i++)
            r.add(new Residence());    
    }
    public void read() {
        try {
            String host="jdbc:derby://localhost:1527/Res";
            String username="reza", password="123";
            Connection con=DriverManager.getConnection(host,username,password);
            Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL="select * from RESIDENCE";
            ResultSet rs=stmt.executeQuery(SQL);
            int i = 0;
            while(rs.next()) {
                r.get(i).setName(rs.getString(1));
                r.get(i).setAddress(rs.getString(2));
                r.get(i).setPrice(rs.getInt(3));
                r.get(i).updateCapacity(rs.getInt(4));
                r.get(i).setSaleSakht(rs.getInt(5));
                i++;
            }
         
            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void update() {
        try {
            String host="jdbc:derby://localhost:1527/Res";
            String username="reza", password="123";
            Connection con=DriverManager.getConnection(host,username,password);
            Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL="select * from RESIDENCE";
            ResultSet rs=stmt.executeQuery(SQL);
            int i ;
            i=0;
            while(rs.next()) {
                rs.updateInt(4,r.get(i).getCapacity());
                i++;
                rs.updateRow();
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
