public class MissingNumber {

    public static final void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,6,7};
        int theLength = numbers.length + 1;
        
        //get the expected
        int expectedSum = theLength * ((theLength + 1) /2);

        int actualSum = 0;
        //get actual values
        for( int num : numbers) {
            actualSum += num;
        }

        System.out.println(expectedSum - actualSum);


    }
}