package shapes;

public class Rectangle {

    protected int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        System.out.println("Rectangle constructed");
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getArea(int l, int w) {
        return l * w;
    }

    public int getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public int getPerimeter(int l, int w) {
        return (2 * l) + (2 * w);
    }

}
