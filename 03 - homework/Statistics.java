/**
Calculates a number of properties about an array of doubles
**/
import java.util.Arrays;


public class Statistics {
    
    //returns the min value of array
    public static double isMin(double[] a) {      
        double min = a[0];

        for(int i = 1; i < a.length; i++) {
           if(a[i] < min) {

               min = a[i];
           }
      }
        return min;
    
    }
    
    public static double isMax(double[] a) {      
     double max = a[0];

     for(int i = 1; i < a.length; i++) {
       if(a[i] > max) {

           max = a[i];
       }
      }
    return max;
    
    }
   
   //returns the mean
   public static double getTheMean(double[] a) {      
    double sum = 0;
    double mean = 0;
    for(int i = 0; i < a.length; i++) {
       sum += a[i];
     mean = sum / a.length;        

    }
     return mean;
    }
   
   //returns the median
   public static double getTheMedian(double[] a) {      

    double median = 0;

    Arrays.sort(a);
    for(int i = 0; i < a.length - 1; i++) {
      if(a.length % 2 > 0) {
        median = a[a.length/2];
      }
      else {
        double middle1 = a[a.length/2];
        double middle2 = a[a.length/2 - 1];
        median = (middle1 + middle2) / 2;
      }
    }
    return median;
    }
    
    //returns the mode of the array
    public static double getTheMode(double[] a){
        
            int mostSeen = 1;
    double mode = a[0];
    int currentCount = 1;

    Arrays.sort(a);

    for(int i = 0; i < a.length-1; i++) {
      if(a[i] == a[i + 1]){
        currentCount++;
      }
        if(currentCount > mostSeen){
          mode = a[i];
          mostSeen = currentCount;
          
        }
        currentCount = 1;
    }
    if(currentCount > mostSeen){
      mostSeen = currentCount;
      mode = a[a.length - 1];
    }
    return mode;
        
    }
    
    //returns the standardDeviation of the array
    public static double standardDeviation(double [] a) {
        double sum = 0;
        double mean = 0;
        for(int i = 0; i < a.length; i++) {
           sum += a[i];
           mean = sum / a.length;                
        }
        
        //subtract the mean and sq the result
        for(int i = 0; i < a.length; i++){
         a[i] =  Math.pow(a[i] - mean, 2);
        }

        //add of up all the values and divide by how many
        double totalOfSquared = 0;
        double finalAnswer =0;
        for(double i : a) {
          totalOfSquared += i/(a.length);
        }
        //then get the sq rt of that 
        return finalAnswer = Math.sqrt(totalOfSquared);  
        
        
    }
    
} 
    
    


