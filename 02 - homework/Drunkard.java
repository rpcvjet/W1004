public class Drunkard {
    
    //instance variables
    private int x;
    private int y;
    
    //constructor
    
    public Drunkard (int avenue, int street) {
        
         avenue = x;
         street = y;
    }
    
    public void step () {
          
        int randomNumber = (int) Math.floor((Math.random() *4) + 1);
        
        switch(randomNumber) {
                
            case 1: 
                x++;
                break;
            case 2: 
                x--;
                break;
            case 3: 
                y++;
                break;
            case 4:
                y--;
                break;
        }
                
    }
    
    public void fastForward (int steps) {
         
        for (int i = 0; i < steps; i++) {
                step();
        }        
    }
    
    public String getLocation () {
        
        return "The Drunkard is at avenue " + x + " and street " + y + ".";
        
    }
    
    public int howFar () {
        
        return x + y;
        
    }
    
}

