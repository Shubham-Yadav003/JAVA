abstract class Area {
    abstract void calculateArea(int side,int b);
    
}

class SquareArea extends Area {
    void calculateArea(int a,int b) {
        int area = a * b;
        System.out.println( area);
    }
}

public class Mainn {
    public static void main(String[] args) {
        SquareArea square = new SquareArea();
        square.calculateArea(5,5);
    }
}
