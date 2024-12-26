public class abstractClass {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.name();
        System.out.println(h.color);  // this is constructor
        dog d=new dog();
        d.name();
        d.walk();
            
        
        
    }
    
}


abstract class  Animal{  
     String color;

    Animal(){    // create the constructor 
        color="brown";
        
    }
    void name(){
        System.out.println("Sumit Lafariya");
    }
    abstract void walk();  // In the the abstract class not implement to abstract method. 
}                          // this is give the idea.

class Horse extends Animal{

    void ChangeColor(){
        color="dark Brown";

    }
    void walk(){
        System.out.println("Horse is very dangerous");
    }
}

class dog extends Animal{

    void ChangeColor(){
        color="black";
    }
    void walk(){
        System.out.print("Dog are very beautiful") ;
    }
}