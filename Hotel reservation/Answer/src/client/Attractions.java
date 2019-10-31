package client;

import static client.Client.a;
import static client.Client.r;
import static client.Client.re;
import static client.Client.reservations;
import java.util.*;

public class Attractions extends Place{
    private String sazande=new String();
    private int saleSakht;
    private int masahat;
    public String getSazande()
    {
        return sazande;
    }
    public int getSaleSakht()
    {
        return saleSakht;
    }
    public int getMasahat()
    {
        return masahat;
    }
    public void setSazande(String s)
    {
        sazande=s;
    }
    public void setSaleSakht(int n)
    {
        saleSakht=n;
    }
    public void setMasahat(int n)
    {
        masahat=n;
    }
    public static int showAtt(int hesab,String[] s)
    {
        boolean f1=true,f2=true;
        int c;
        Scanner input= new Scanner(System.in);
        if (re[2]==false)System.out.println("1-"+a[0].getName()+"     "+a[0].getAddress()+"      "+Residence.getCapacity(2)+"      qheymate har bilit:"+a[0].getPrice());
        if (re[3]==false)System.out.println("2-"+a[1].getName()+"     "+a[1].getAddress()+"      "+Residence.getCapacity(3)+"      qheymate har bilit:"+a[1].getPrice());
        System.out.println("0-back");
        f1=true;
        f2=true;
        switch(input.nextInt())
        {
            case 0:
                break;
            case 1:
                System.out.println("1-reserve");
                System.out.println("2-tarikhche");
                System.out.println("0-back");
                switch(input.nextInt())
                {
                    case 0:
                        break;
                    case 1:
                        System.out.println("chand ta mikhayn ?");
                        c=input.nextInt();
                        while(c>Residence.getCapacity(2)||c*a[0].getPrice()>hesab)
                                {
                                     if(c>Residence.getCapacity(2))
                                     {
                                        System.out.println("tedade entekhab sode bishtar az zarfiate mojood bood lotfan dobare zarfiate momken ra entekhab konid ya baraye bazgasht be menu  0 ra vared konid ");
                                        f2=false;
                                     }
                                     if(c*a[0].getPrice()>hesab)
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
                                    re[2]=true;
                                    Residence.updateCapacity(-c, 2);
                                    hesab=hesab-c*a[0].getPrice();
                                    reservations[2]+=c;
                                    s[2]="3-"+a[0].getName()+"     "+a[0].getAddress()+"      "+reservations[2];
                                    System.out.println();
                                }
                        break;
               case 2:
                System.out.println("1-sazande");
                System.out.println("2-saleSakht");
                System.out.println("3-masahat");
                System.out.println("0-back");
                switch(input.nextInt())
                {
                    case 0:
                        break;
                    case 1:
                        System.out.println(a[0].getSazande());
                        break;
                    case 2:
                        System.out.println(a[0].getSaleSakht());
                        break;
                    case 3:
                        System.out.println(a[0].getMasahat());
                        break;
                }
                        break;
                }
                break;
            case 2:
                System.out.println("1-reserve");
                System.out.println("2-tarikhche");
                System.out.println("0-back");
                switch(input.nextInt())
                {
                    case 0:
                        break;
                    case 1:
                        System.out.println("chand ta mikhayn ?");
                        c=input.nextInt();
                        while(c>Residence.getCapacity(3)||c*a[1].getPrice()>hesab)
                                {
                                     if(c>Residence.getCapacity(3))
                                     {
                                        System.out.println("tedade entekhab sode bishtar az zarfiate mojood bood lotfan dobare zarfiate momken ra entekhab konid ya baraye bazgasht be menu  0 ra vared konid ");
                                        f2=false;
                                     }
                                     if(c*a[1].getPrice()>hesab)
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
                                    re[3]=true;
                                    Residence.updateCapacity(-c, 3);
                                    hesab=hesab-c*a[1].getPrice();
                                    reservations[3]+=c;
                                    s[3]="4-"+a[1].getName()+"     "+a[1].getAddress()+"      "+reservations[3];
                                    System.out.println();
                                }
                        break;
               case 2:
                System.out.println("1-sazande");
                System.out.println("2-saleSakht");
                System.out.println("3-masahat");
                System.out.println("0-back");
                switch(input.nextInt())
                {
                    case 0:
                        break;
                    case 1:
                        System.out.println(a[1].getSazande());
                        break;
                    case 2:
                        System.out.println(a[1].getSaleSakht());
                        break;
                    case 3:
                        System.out.println(a[1].getMasahat());
                        break;
                }
                        break;
                }
                break;
        }
        return hesab;
    }
}
