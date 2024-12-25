public class GetterandSetter {


    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.settip(3);
        System.out.println(p1.gettip());

    }
    
}
class Pen{
    private String color;
    private int tip;

    String getColor(){             

        return this.color;

    }
    int gettip(){
        return this.tip;

    }


    void setColor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
    
}
