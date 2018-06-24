import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class Fail2Ban {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter File Name: ");
        String somefile = console.nextLine();

        Scanner reading = null;

        try {
            File textFile = new File(somefile);
             reading = new Scanner(textFile);
        }
        catch(FileNotFoundException e) {
            System.err.println("File doesn't exist");
            System.exit(-1);
        }

        String[] accessed = null;
        ArrayList<String> badIps = new ArrayList<String>();

        while(reading.hasNextLine()) {
            String line = reading.nextLine();
            if(line.contains("Invalid")){
                accessed = line.split(" ");
                badIps.add(accessed[9]);       
            }
        }
        Collections.sort(badIps);
        int mult = 0;
        ArrayList<String> finalArray = new ArrayList<String>();

        for(int i = 0; i < badIps.size() -1 ; i++ ){
            for( int j = i + 1; j < badIps.size() -1; j++){
                if(badIps.get(i).equals(badIps.get(j))){
                    mult++;
                    
                }
                
            }

            if(mult >= 3){
                finalArray.add(badIps.get(i));
                i = i + mult;    

                mult = 0;          
                
            }

        }
        System.out.println("Prof., the follwing IP address tried to enter your server at least 3 times: ");
        System.out.println(finalArray);
    }


}