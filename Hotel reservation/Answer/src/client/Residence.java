package client;

import static client.Client.r;
import static client.Client.reservations;
import static client.Client.re;
import java.util.*;

public class Residence extends Place {
    
    
    public static int reservation(int hesab,String[] s)
    {
                        boolean f1=true,f2=true;
                        int c;
                        Scanner input= new Scanner(System.in);
                        if (re[0]==false)System.out.println("1-"+r[0].getName()+"     "+r[0].getAddress()+"      "+Residence.getCapacity(0)+"      qheymate har bilit:"+r[0].getPrice());
                        if (re[1]==false)System.out.println("2-"+r[1].getName()+"     "+r[1].getAddress()+"      "+Residence.getCapacity(1)+"      qheymate har bilit:"+r[1].getPrice());
                        System.out.println("0-back");
                        f1=true;
                        f2=true;
                        switch( input.nextInt() )
                        {
                            case 1:
                                System.out.println("chand ta mikhayn ?");
                                c=input.nextInt();
                                while(c>Residence.getCapacity(0)||c*r[0].getPrice()>hesab)
                                {
                                     if(c>Residence.getCapacity(0))
                                     {
                                        System.out.println("tedade entekhab sode bishtar az zarfiate mojood bood lotfan dobare zarfiate momken ra entekhab konid ya baraye bazgasht be menu  0 ra vared konid ");
                                        f2=false;
                                     }
                                     if(c*r[0].getPrice()>hesab)
                                     {
                                         System.out.println("mojoodi hesabe shoma kafi nist lotfan dobare zarfiat entekhab konid ya baraye bazgasht be menu  0 ra vared konid");
                                         f2=false;
                                     }
                                     if(f2==false)
                                         System.out.println("0-back");
                                     c=input.nextInt();
                                     if(c==0)
                                         f1=false;
                                }
                                if (f1==true)
                                {
                                    System.out.println("reservation ba movafaghiat anjam shod");
                                    re[0]=true;
                                    Residence.updateCapacity(-c, 0);
                                    hesab=hesab-c*r[0].getPrice();
                                    reservations[0]+=c;
                                    s[0]="1-"+r[0].getName()+"     "+r[0].getAddress()+"      "+reservations[0];
                                    System.out.println();
                                }
                                break;
                            case 2:
                                System.out.println("chand ta mikhayn ?");
                                c=input.nextInt();
                                while(c>Residence.getCapacity(1)||c*r[1].getPrice()>hesab)
                                {
                                     if(c>Residence.getCapacity(1))
                                     {
                                        System.out.println("tedade entekhab sode bishtar az zarfiate mojood bood lotfan dobare zarfiate momken ra entekhab konid ya baraye bazgasht be menu  0 ra vared konid ");
                                        f2=false;
                                     }
                                     if(c*r[1].getPrice()>hesab)
                                     {
                                         System.out.println("mojoodi hesabe shoma kafi nist lotfan dobare zarfiat entekhab konid ya baraye bazgasht be menu  0 ra vared konid");
                                         f2=false;
                                     }
                                     if(f2==false)
                                         System.out.println("0-back");
                                     c=input.nextInt();
                                     if(c==0)
                                         f1=false;
                                }
                                if(f1==true)
                                {
                                    System.out.println("reservation ba movafaghiat anjam shod");
                                    re[1]=true;
                                    Residence.updateCapacity(-c, 1);
                                    hesab=hesab-c*r[1].getPrice();
                                    reservations[1]+=c;
                                    s[1]="2-"+r[1].getName()+"     "+r[1].getAddress()+"      "+reservations[1];
                                    System.out.println();
                                }
                                break;
                            case 0:
                                break;
                        }
                        return hesab;
    }
}
