import java.util.Arrays;

/* Class does the checksum if the credit card number is valid */
public class CreditCard {
    
    private static String creditCardNumber;
    private static boolean valid = true;
    private static int errorCode = 0;
    
    public CreditCard (String ccnumber){
        creditCardNumber = ccnumber;   
    }
     
    //if all return true, then isValid will be called. if they dont, then getErrorCode
    //is ran in the respective function.
    public static void check() {   

      if( 
      getFirstDigit(creditCardNumber)  && 
      getFourthDigit(creditCardNumber) &&
      getProductofTwentyFour(creditCardNumber) &&
      divisibleByFour(creditCardNumber) &&
      firstFourLastFour(creditCardNumber) &&
      TwoDigitsEqualHundred(creditCardNumber)
      ){
         isValid();
       }
     
    }
    
    public static boolean isValid() {
      return valid;
    }
    
    public static int getErrorCode() {
      return errorCode;
    }

    public static boolean getFirstDigit(String x){

      char first = x.charAt(0);
      if(first != '4'){
        System.out.println("getfirstStringERRROR");
        errorCode = 1;
        getErrorCode();
        valid = false;
        
      }
        return valid;
    }
    
      //char at 4 must be one greater than char at 5
      //need to make them integers to compare 
    public static boolean getFourthDigit(String x) {
  
      char fourth = x.charAt(3);
      char fifth = x.charAt(4);

      int four = Character.getNumericValue(fourth);
      int five = Character.getNumericValue(fifth);
      int sum = four + five;
      if(five > four || sum % 2 == 0){
        System.out.println("getFourthDigitERRROR");
          valid=false;
          errorCode = 2;
          getErrorCode();
      }  
        return valid; 
    }
    
    /* @return boolean true the product of index 1,5, and 9 = 100   */
    public static boolean getProductofTwentyFour(String x){
       char first = x.charAt(0);
       char fifth = x.charAt(4);
       char ninth = x.charAt(8);
      
      int one = Character.getNumericValue(first);
      int five = Character.getNumericValue(fifth);
      int nine = Character.getNumericValue(ninth);   
      int product = one * five * nine;

      if(product != 24) {
        valid = false;
        System.out.println("twnetyFourERROR");
          errorCode = 3;
          getErrorCode();   
      }    
        return valid;    
    }

    public static boolean divisibleByFour(String x){
      String[] a = x.split("");
      int sum = 0;
      int[] b = new int[a.length];
      
      for(int i = 0; i< a.length; i++) {
        String convert = a[i];
        b[i] = Integer.parseInt(convert);        
      }

      for(int num : b){
        sum += num;
      }

      if(sum % 4 != 0) {
       
        System.out.println("divisibleByFourERROR");
          errorCode = 4;
          getErrorCode();   
           valid = false;
      }
      return valid;
    }

//The sum of the first four digits must be one less than 
////the sum of the last four digits
    public static boolean firstFourLastFour(String x){

     String[] a = x.split("");
      int sumFirstFour = 0;
      int sumLastFour = 0;
      
      int[] b = new int[a.length];
      
      for(int i = 0; i < a.length - 8; i++) {
        String convert = a[i];
        b[i] = Integer.parseInt(convert);   
          sumFirstFour += b[i];     
      }

      for(int i = 8; i < a.length; i++) {
      String convert = a[i];
      b[i] = Integer.parseInt(convert);  
      sumLastFour += b[i];      
      }
      int total = sumFirstFour + sumLastFour;

      if(sumFirstFour >= sumLastFour || total % 2 == 0 ) {
          valid = false;
          System.out.println("firstFourLastFourERROR");
          errorCode = 5;
          getErrorCode();  

      }
      
        return valid;
      
    }

     /** If you treat the first two digits as a two-digit number, 
      * and the seventh and eight digits as a two digit number, their sum must be 100*/
    public static boolean TwoDigitsEqualHundred(String x) {
      String[] a = x.split("");
      
      int[] b = new int[a.length];

      int first = 0 ,second = 0 , firstSecondCombined = 0;
      int seven = 0 ,eight = 0 , sevenEightCombined = 0, sum = 0;
  
      for(int i = 0; i < a.length; i++) {
        String convert = a[i];
        b[i] = Integer.parseInt(convert);   
        first = b[0];
        second =b[1];
        seven = b[6];
        eight = b[7];
        firstSecondCombined = Integer.valueOf(String.valueOf(first) + String.valueOf(second));
        sevenEightCombined = Integer.valueOf(String.valueOf(seven) + String.valueOf(eight));
      }

      sum =firstSecondCombined + sevenEightCombined;
      if(sum != 100) {
          valid = false;
          System.out.println("TwoDigitsEqualHundredERROR");
          errorCode = 6;
          getErrorCode();  

      }
        return valid;
    }
  
}
