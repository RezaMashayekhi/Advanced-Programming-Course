
package Re;

import java.util.*;

public class Client {
    public static void main(String args[]){
                ArrayList<Residence> r = new ArrayList<Residence>();  
                ReadDB rdb = new ReadDB(r);
                rdb.read(); 
                boolean ques = true,f1=true,f2=true;
                boolean re[]=new boolean[2];
                int[] reservations=new int [2]; reservations[0]=0;reservations[1]=0;
                Scanner input= new Scanner(System.in);
                int c;
                String[] s=new String[2];
                System.out.println("meghdare hesabe khod ra vared konid");
                int hesab=input.nextInt();
                System.out.println();
                for(int i=0;i<2;i++)
                {
                    re[i]=false;
                }
                while( ques ) {
                    System.out.println("mojoodi hesab :"+hesab);
                    System.out.println();
                    System.out.println("1-Residences");
                    System.out.println("2-Your reservations");
                    System.out.println("3-Exit");
                    System.out.println();
                    f1=true;
                    f2=true;

                    switch( input.nextInt() ) {
                        case 1:
                                hesab=Residence.reservation(hesab, s,re,r,reservations); 
                                break;
                        case 2:
                            System.out.println("0-back");
                            for(int i=0;i<2;i++)
                            {
                                if(s[i]!=null)
                                    System.out.println(s[i]);
                            }
                            System.out.println("mitavanid cancel konid");
                            switch( input.nextInt() )
                            {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("chand ta ra mikhain cancel konin? (15% bargardande mishavad)");
                                    c=input.nextInt();
                                    while(c>reservations[0])
                                    {
                                        System.out.println("meghdare vared shode bishtar az meghdar reserve shode hast lotfan dobare vared konid");
                                        c=input.nextInt();
                                    }
                                    reservations[0]-=c;
                                    s[0]="1-"+r.get(0).getName()+"     "+r.get(0).getAddress()+"      "+reservations[0];
                                    r.get(0).updateCapacity(c);
                                    hesab+=c*0.15*r.get(0).getPrice();
                                    break;
                                case 2:
                                    System.out.println("chand ta ra mikhain cancel konin? (15% bargardande mishavad)");
                                    c=input.nextInt();
                                    while(c>reservations[1])
                                    {
                                        System.out.println("meghdare vared shode bishtar az meghdar reserve shode hast lotfan dobare vared konid");
                                        c=input.nextInt();
                                    }
                                    reservations[1]-=c;
                                    s[1]="2-"+r.get(1).getName()+"     "+r.get(1).getAddress()+"      "+reservations[1];
                                    r.get(1).updateCapacity(c);
                                    hesab+=c*0.15*r.get(1).getPrice();
                                    break;
                             }
                        break;
                        case 3:
                            for(int i=0;i<2;i++)
                            {
                                s[i]=null;
                                reservations[i]=0;
                                re[i]=false;
                            }
                            rdb.update();
                            System.out.println();
                            System.out.println("karbare jadid meghdare hesabe khod ra vared konid");
                            hesab=input.nextInt();
                            System.out.println();
                            break;
                    }
                }
    }
}
