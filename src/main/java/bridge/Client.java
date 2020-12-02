package bridge;

public class Client {

    public static void main(String[] args) {

        Circle circle = new Circle(new Red());
        circle.printShape();

        Square square = new Square(new Green());
        square.printShape();

    }
}
