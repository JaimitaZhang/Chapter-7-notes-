
public class Snake extends Reptile 
{
    private int lengths; 
    public Snake()
    {
     System.out.println("Hello from Snake default constructor"); 
    }
    
    public Snake (int length)
    {
     lengths = length; 
    }
    
    public int getLength() 
    {return lengths; 
    }
    
    public String move() 
    {return "slither";  //doesn't have to but can override move 
    }
    
    public String toString () 
    {return (super.toString() + "\n I am " + lengths + " meters long"); 
    }

   

}
