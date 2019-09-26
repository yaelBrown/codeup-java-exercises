package shapes;

public class Square extends Rectangle {

    private int side;

    public void Square(int side) {
        this.side = side;
    }

    public Square(int side, int length, int width) {
        super(length, width);
    }

    public Square(int s) {
        this.side = s;
    }

    public int getArea() {
        return this.side * this.side;
    }

    public int getPerimeter() {
        return 4 * this.side;
    }
}
