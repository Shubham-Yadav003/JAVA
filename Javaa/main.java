abstract class Area {
    abstract void calculateArea(int side);
}

class SquareArea extends Area {
    void calculateArea(int side) {
        int area = side * side;
        System.out.println( area);
    }
}

public class Main {
    public static void main(String[] args) {
        SquareArea square = new SquareArea();
        square.calculateArea(5);
    }
}
