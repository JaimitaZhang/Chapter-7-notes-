
public class Cobra extends Snake
{
    String color; 
    public Cobra () 
    {
    }
    
    public Cobra(String col)
    {   color = color; 
    }
    
    public String getColor()
    {   return color; 
    }
    
    public String toString () 
    {   return (super.toString() + " and has a color of " + color); 
    }
    
    //doesn't need move method because it inherits from snake (technically already has it!!!!!!) 
    //can make it ot override it because ti makes it more specific
    //abstract classes don't have to implement abstract methods! 

}
