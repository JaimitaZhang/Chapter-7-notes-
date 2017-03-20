
public abstract class Reptile extends Animal
{
    private int numberOfLegs;
    
    //Create a reptile with no Legs 
    public Reptile()
    {
        //call the default constructor of Animal
        //happens automatically
        //super(); 
        
        super("reptile"); //overides call to super 
        //type = "reptile"; //private data will cause error 
        numberOfLegs = 0; 
    }
    
    public Reptile (int numberLegs)
    {super("reptile");
     numberOfLegs = numberLegs; 
    }
    
    public int getLegs () 
    {
    return numberOfLegs;
    }
    
    //has to be implemented, abstract method
    public String move() 
    { return "crawl"; 
    }
    
    public String toString()
    {   return super.toString() + 
        "\nI have" + getLegs() + " number of legs"; 
    }
}
