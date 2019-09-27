package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(int l, int w) {
        super(l, w);
    }

    // Can use this. or super. to refer to variables defined in super class.
    @Override
    void setLength(int l) {
        this.length = l;
    }

    @Override
    void setWidth(int w) {
        super.width = w;
    }
}