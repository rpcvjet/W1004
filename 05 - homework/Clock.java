import java.time.Instant;

public class Clock {

  private int hour;
  private int minute;
  private String time;


  public int getHours(){

    String utc =  Instant.now().toString();
    String h = utc.substring(11,13);
    return Integer.parseInt(h);
    
  }

  public int getMinutes() {

    String utc =  Instant.now().toString();
    String m = utc.substring(14,16);
    return Integer.parseInt(m);
    
  }

  public String getTime(){
    return getHours() +  ":" + getMinutes();
  }
}

