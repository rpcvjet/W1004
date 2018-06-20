import java.util.Arrays;

class Rotate {
  public static void main(String[] args) {

    int[] a = {2, 3, 5, 7, 11, 13};
    int last = a.length - 1;
    // 3,5,7,11,13,2

    int temp = a[0];

    for(int i = 1; i <= a.length -1; i++) {
         a[i - 1] = a[i];

    }
      a[a.length -1] = temp;
  System.out.println(Arrays.toString(a));

  
  }
}