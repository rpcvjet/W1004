/** Change.java - add your solutiuon to program 3 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class Change {
    
    public static final void main(String[] args) {
        
        Scanner prompt = new Scanner(System.in);
         
        System.out.print("How much is due? Please enter in pennies ");
        int amountDue = prompt.nextInt();
        
        System.out.print("And how much are you giving to the cashier? ");
        int amountRecived = prompt.nextInt();
        
        int difference = amountRecived - amountDue;
        
//         System.out.println(difference);
        
        int quarters = difference/25;
        int Quarterremainder= difference % 25;
        
        
        int dimes = Quarterremainder/10;
        int dimesRemainder = Quarterremainder % 10;
        
//         System.out.println(dimes);
//         System.out.println(dimesRemainder);
        
        int nickel = dimesRemainder/5;
        int nickelRemainder = dimesRemainder % 5;
        
        int pennies = nickelRemainder/1;
        int pennyRemainder = nickelRemainder % 1;
          
//         System.out.println(nickel);
//         System.out.println(nickelRemainder);
        
        System.out.println("You will get " + quarters + " quarter(s), " + dimes + " dime(s), " 
                           + nickel + " nickel(s), and " + pennies + " pennies." );
        
        
    }
    
    
}