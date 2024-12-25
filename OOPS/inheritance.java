public class inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        
    }
    
}
//this is Parent class
class animal{
    String color;
    int rate;

    void eat(){
        System.out.println("eat");
    }
    void breadth(){
        System.out.println("breadth");
    }
}


// this is child class 
class Fish extends animal{
    String name;

    void rate(){
        System.out.println("rate this fish");
    }
}