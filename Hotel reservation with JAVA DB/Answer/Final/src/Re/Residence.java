
package Re;

import java.util.ArrayList;
import java.util.Scanner;

public class Residence extends Place {
    private int SaleSakht;
     public int getSaleSakht() {
        return this.SaleSakht;
    }
    public void setSaleSakht(int n) {
        this.SaleSakht += n;
    }
    public static int reservation(int hesab,String[] s,boolean re[],ArrayList<Residence> r,int reservations[])
    {
                        boolean f1=true,f2=true;
                        int c;
                        Scanner input= new Scanner(System.in);
                        if (re[0]==false)System.out.println("1-"+r.get(0).getName()+"     "+r.get(0).getAddress()+"      "+r.get(0).getCapacity()+"      qheymate har bilit:"+r.get(0).getPrice()+"         sale sakht:"+r.get(0).getSaleSakht());
                        if (re[1]==false)System.out.println("2-"+r.get(1).getName()+"     "+r.get(1).getAddress()+"      "+r.get(1).getCapacity()+"      qheymate har bilit:"+r.get(1).getPrice()+"         sale sakht:"+r.get(1).getSaleSakht());
                        System.out.println("0-back");
                        f1=true;
                        f2=true;
                        switch( input.nextInt() )
                        {
                            case 1:
                                System.out.println("chand ta mikhayn ?");
                                c=input.nextInt();
                                while(c>r.get(0).getCapacity()||c*r.get(0).getPrice()>hesab)
                                {
                                     if(c>r.get(0).getCapacity())
                                     {
                                        System.out.println("tedade entekhab sode bishtar az zarfiate mojood bood lotfan dobare zarfiate momken ra entekhab konid ya baraye bazgasht be menu  0 ra vared konid ");
                                        f2=false;
                                     }
                                     if(c*r.get(0).getPrice()>hesab)
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
                                    r.get(0).updateCapacity(-c);
                                    hesab=hesab-c*r.get(0).getPrice();
                                    reservations[0]+=c;
                                    s[0]="1-"+r.get(0).getName()+"     "+r.get(0).getAddress()+"      "+reservations[0];
                                    System.out.println();
                                }
                                break;
                            case 2:
                                System.out.println("chand ta mikhayn ?");
                                c=input.nextInt();
                                while(c>r.get(1).getCapacity()||c*r.get(1).getPrice()>hesab)
                                {
                                     if(c>r.get(1).getCapacity())
                                     {
                                        System.out.println("tedade entekhab sode bishtar az zarfiate mojood bood lotfan dobare zarfiate momken ra entekhab konid ya baraye bazgasht be menu  0 ra vared konid ");
                                        f2=false;
                                     }
                                     if(c*r.get(1).getPrice()>hesab)
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
                                    re[1]=true;
                                    r.get(1).updateCapacity(-c);
                                    hesab=hesab-c*r.get(1).getPrice();
                                    reservations[1]+=c;
                                    s[1]="1-"+r.get(1).getName()+"     "+r.get(1).getAddress()+"      "+reservations[1];
                                    System.out.println();
                                }
                                break;
                        }
                        return hesab;
    }
}
