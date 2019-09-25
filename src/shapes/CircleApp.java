package shapes;

// static ?
// fqn ?
import static util.Input.getDouble;

public class CircleApp {

    public static void main(String[] args) {

        Circle c1 = new Circle(getDouble());

        System.out.println(c1.getArea());

    }

}