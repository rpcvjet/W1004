public class WorldClock extends Clock {

    private int offset;
   
    public WorldClock(int off) {
  
    offset = off;
    }
  
    public int getHours() {
  
     return super.getHours() + offset; 
    }
  }