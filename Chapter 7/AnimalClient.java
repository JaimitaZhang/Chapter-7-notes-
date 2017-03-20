
public class AnimalClient
{
   
   public static void main (String [] args)
   {//Animal bob = new Animal ("Mammal"); -> compile error because Animal is abstract 
    //System.out.println(bob ); 
    
    Reptile sue = new Reptile(); 
    System.out.println(sue.getType());
    System.out.println(sue); 
    
    // Snake Jill = new Reptile ();  doesn't work, not polymorphic
    Reptile Jill = new Snake(); 
    Animal David = new Snake(); 
    
    Snake Brian = new Snake (10);
    System.out.println(Brian.getType()); 
    System.out.println(Brian.getLegs());
    System.out.println(Brian); 
    }

}
