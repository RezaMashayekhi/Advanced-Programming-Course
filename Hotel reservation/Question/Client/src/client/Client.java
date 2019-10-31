package client;

import java.util.Scanner;

/**
 *
 * @author unknown
 */
public class Client {
    
    public static void menu() {
        boolean ques = true;
        Scanner input= new Scanner(System.in);
        
        while( ques ) {
            System.out.println("press 1 to ..., press 2 to ...");
            switch( input.nextInt() ) {
                case 1: 
                        break;
            }
        }
    }
    
    public static void main(String[] args) {
        menu();
    }
    
}
