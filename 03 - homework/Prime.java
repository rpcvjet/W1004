public class Prime {
    
    public static final void main(String[] main) {
        
    isPrime(0); 
    isPrime(2);
    isPrime(3);
    isPrime(17);
    isPrime(218);
     
    }
    
    //Method takes in an int, and calculates if int passed in
    //is a Prime number or not.
    public static boolean isPrime(int n) {
                    
       double sr = Math.sqrt(n);
       boolean result = true; 
        if( n <= 1){
            System.out.println(n + " IS a NOT prime number.");        
        }
        
        if(n == 2 || n ==3) {
            System.out.println(n + " IS a prime number.");
        }
        
       for(int i = 2; i <= sr; i++) {
           int compare = n % i;     
           if(compare == 0){
           System.out.println(n + " is NOT a prime number.");
           result = false;
           break;            
           }
           else {
           System.out.println(n + " IS a prime number.");
           break;
           }
       }        
           return result;
    }
         
    
   

}