import java.util.Scanner;
import java.util.Arrays;

public class StatisticsTester {
    
    
    public static void main(String[] args){
        
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Please enter the size of array");
        
        int sizeofArray = prompt.nextInt();
        
        double[] dataArray = new double[sizeofArray];
        System.out.println("Please enter " + sizeofArray + " doubles data types");
        
        for(int i = 0; i < dataArray.length; i++) {
            dataArray[i] = prompt.nextDouble();
        }
           
          double minNumber = Statistics.isMin(dataArray);
          double maxNumber = Statistics.isMax(dataArray);
          double meanNumber = Statistics.getTheMean(dataArray);
          double medianNumber = Statistics.getTheMedian(dataArray);
          double modeNumber = Statistics.getTheMode(dataArray);
          double SDNumber = Statistics.standardDeviation(dataArray);

          System.out.println("The Min is " + minNumber);
          System.out.println("The Max is " + maxNumber);
          System.out.println("The Mean is " + meanNumber);
          System.out.println("The Median is " + medianNumber);
          System.out.println("The Mode is " + modeNumber);
          System.out.println("The Standard Deviation is " + SDNumber);

    }

}