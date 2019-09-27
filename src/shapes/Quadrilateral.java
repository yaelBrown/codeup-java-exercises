package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    // Switch from private to protected to use from shapes.Rectangle
    protected int length;

    protected int width;

    public Quadrilateral(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    abstract void setLength(int l);

    abstract void setWidth(int w);

    @Override
    public double getArea() {
        System.out.println("quadrilateral getArea");
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("quadrilateral perimeter");
        return (2 * this.length) + (2 * this.width);
    }
}
