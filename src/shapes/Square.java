package shapes;

public class Square extends Quadrilateral {

    public Square(int l, int w) {
        super(l, w);
    }

    @Override
    void setLength(int l) {
        System.out.println("Not sure what this is doing");
    }

    @Override
    void setWidth(int w) {
        System.out.println("Not sure what this is also doing");
    }
}