public class ClockTester {
    public static void main(String[] args) {
      
          Clock c = new Clock();
           c.getMinutes();
           c.getHours();
           System.out.println("*****UTC TIME*****");
          System.out.println(c.getTime());
      
          WorldClock wc = new WorldClock(-4);
           wc.getMinutes();
           wc.getHours();
           System.out.println("*****NYC TIME*****");
          
          System.out.println(wc.getTime());
          
          
      }
      
  }