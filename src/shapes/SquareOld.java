package shapes;

public class SquareOld extends RectangleOld {

    private int side;

    public void Square(int side) {
        this.side = side;
    }

//    public SquareOld(int side, int length, int width) {
//        super(length, width);
//    }

    public SquareOld(int s) {
        this.side = s;
    }

    public int getArea() {
        return this.side * this.side;
    }

    public int getPerimeter() {
        return 4 * this.side;
    }
}
