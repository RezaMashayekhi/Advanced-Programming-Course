package client;

import java.util.Scanner;



public class Client {
    static Residence[] r=new Residence[2];
    static Attractions[] a=new Attractions[2]; 
    static int[] reservations=new int [4];
    static boolean[] re=new boolean[4];
    public static void menu() {
        boolean ques = true,f1=true,f2=true;
        Scanner input= new Scanner(System.in);
        int c;
        String[] s=new String[4];
        System.out.println("meghdare hesabe khod ra vared konid");
        int hesab=input.nextInt();
        System.out.println();
        for(int i=0;i<4;i++)
        {
            re[i]=false;
        }
        while( ques ) {
            System.out.println("mojoodi hesab :"+hesab);
            System.out.println();
            System.out.println("1-Residences");
            System.out.println("2-Attractions");
            System.out.println("3-Your reservations");
            System.out.println("4-Exit");
            System.out.println();
            f1=true;
            f2=true;
            
            switch( input.nextInt() ) {
                case 1:
                         hesab=Residence.reservation(hesab, s);
                        break;
                case 2:
                    hesab=Attractions.showAtt(hesab,s);
                    break;
                case 3:
                    System.out.println("0-back");
                    for(int i=0;i<4;i++)
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
                            s[0]="1-"+r[0].getName()+"     "+r[0].getAddress()+"      "+reservations[0];
                            Residence.updateCapacity(c, 0);
                            hesab+=c*0.15*r[0].getPrice();
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
                            s[1]="2-"+r[1].getName()+"     "+r[1].getAddress()+"      "+reservations[1];
                            Residence.updateCapacity(c, 1);
                            hesab+=c*0.15*r[1].getPrice();
                            break;
                        case 3:
                            System.out.println("chand ta ra mikhain cancel konin? (15% bargardande mishavad)");
                            c=input.nextInt();
                            while(c>reservations[2])
                            {
                                System.out.println("meghdare vared shode bishtar az meghdar reserve shode hast lotfan dobare vared konid");
                                c=input.nextInt();
                            }
                            reservations[2]-=c;
                            s[2]="3-"+a[0].getName()+"     "+a[0].getAddress()+"      "+reservations[2];
                            Residence.updateCapacity(c, 2);
                            hesab+=c*0.15*a[0].getPrice();
                            break;
                            case 4:
                            System.out.println("chand ta ra mikhain cancel konin? (15% bargardande mishavad)");
                            c=input.nextInt();
                            while(c>reservations[3])
                            {
                                System.out.println("meghdare vared shode bishtar az meghdar reserve shode hast lotfan dobare vared konid");
                                c=input.nextInt();
                            }
                            reservations[3]-=c;
                            s[3]="4-"+a[1].getName()+"     "+a[1].getAddress()+"      "+reservations[3];
                            Residence.updateCapacity(c, 3);
                            hesab+=c*0.15*a[1].getPrice();
                            break;
                    }
                    break;
                case 4:
                    for(int i=0;i<4;i++)
                    {
                        s[i]=null;
                        reservations[i]=0;
                        re[i]=false;
                    }
                    System.out.println();
                    System.out.println("karbare jadid meghdare hesabe khod ra vared konid");
                    hesab=input.nextInt();
                    System.out.println();
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        
        for(int i=0; i<2;i++)
        {
            r[i]=new Residence();
            a[i]=new Attractions();
        }
        r[0].setName("qhoo");
        r[0].setAddress("behshar");
        r[0].setPrice(300);
        Residence.updateCapacity(50,0);
        r[1].setName("ordak");
        r[1].setAddress("noshahr");
        r[1].setPrice(500);
        Residence.updateCapacity(70,1);
        a[0].setName("baghe gol");
        a[0].setAddress("bolvare ...");
        a[0].setSazande("aghaye ...");
        a[0].setSaleSakht(1349);
        a[0].setMasahat(20000);
        a[0].setPrice(400);
        Place.updateCapacity(60,2);
        a[1].setName("mooze");
        a[1].setAddress("bolvare ,,,");
        a[1].setSazande("khonoome ...");
        a[1].setSaleSakht(1359);
        a[1].setMasahat(8000);
        a[1].setPrice(800);
        Place.updateCapacity(40,3);
        menu();
    }
    
}
