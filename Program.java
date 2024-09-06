//import stuff here
import java.util.Scanner;
//Your code here
public class Program7{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //initializing
        int bucks = 0;
        int klevin = 0;
        int nickel = 0;
        
        //conversion
        final int klevinPerBuck = 20;
        final int nickelPerKlevin = 12; 
        final int nickelPerBuck = 100;
        
        //user input
        System.out.print("Enter schrute-bucks: ");
        bucks = myScanner.nextInt();
        
        System.out.println();
        System.out.print("Enter klevins: ");
        klevin = myScanner.nextInt();
        
        System.out.println();
        System.out.print("Enter stankley-nickels: ");
        nickel = myScanner.nextInt();
        
        
         //calculator
        double klevinToBucks = (double) klevin / klevinPerBuck;
        double nickelsToBucks = nickel / nickelPerBuck;
        
        double totalBucks = (double) bucks + klevinToBucks + nickelsToBucks;
        
        //final calculation
        totalBucks =(int)(totalBucks * 100 + 0.5)/100.0;


        System.out.println();
        System.out.println("Decimal schrute-bucks: " + totalBucks);
        
        
    }  
}
//Paste console output below:
/*
Enter schrute-bucks: 7

Enter klevins: 17

Enter stankley-nickels: 9

Decimal schrute-bucks: 7.89

*/
