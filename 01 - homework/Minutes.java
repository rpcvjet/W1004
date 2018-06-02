/** Minutes.java - add your solutiuon to program 2 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class Minutes {
    
    public static final void main(String[] args) {
        
        Scanner prompt = new Scanner(System.in);
        
        System.out.print("Please enter a number of hours: ");
        int hours = prompt.nextInt();
        int hoursToMinutes = hours * 60; 
        
//      System.out.println("There are " + hoursToMinutes + " minutes in " + hours +  " hour(s).");
        
        
        System.out.print("Please enter the number of days: ");     
        int days = prompt.nextInt();
        int daysToMinutes = days * 1440; 
        
//      System.out.println("There are " + daysToMinutes + " minutes in " + days +  " day(s).");
        

        System.out.print("Please enter a number of weeks: ");
        
             int week = prompt.nextInt();
             int weekToMinutes = week * 10080; 
        
//      System.out.println("There are " + weekToMinutes + " minutes in " + week +  " week(s).");
        
        System.out.print("Please enter a number of years: ");
        
             int year = prompt.nextInt();
             int yearToMinutes = year * 525600; 
        
//      System.out.println("There are " + yearToMinutes + " minutes in " + year +  " year(s).");
        
            int totalMinutes = hoursToMinutes + daysToMinutes + weekToMinutes + yearToMinutes;
        
        System.out.println("In total, that would be " + totalMinutes + " minutes");
       
    }
    
    
}