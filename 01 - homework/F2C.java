/** F2C.java - add your solutiuon to program 1 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class F2C {
    
    public static final void main(String[] args) {
        
        Scanner prompt = new Scanner(System.in);
        
        System.out.print("Please enter a Fahrenheit tempeture to be converted into Celcius: ");
        
        int farenheight = prompt.nextInt();
        
        //ah hah -- fractions are considered ints 
        int celcius = (farenheight - 32) * 5/9;

        System.out.println("That would be " + celcius + " Celcius");
        
    }
     
}