public class interfaces {
    public static void main(String[] args) {
        Queen p=new Queen();
        p.move();
        
    }
    
}


interface chessPlayer{
    void move();
}

class Queen implements chessPlayer{
    public void move(){
        System.out.println("up,down,rigth,left");
    }
}

class king implements chessPlayer{
    public void move(){
        System.out.println("up,right,left,down");
    }
}

class rook implements chessPlayer{
    public void move(){
        System.out.println("rigth,left,down,up");
    }
}

    
