package bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    public void printShape() {
        printColor();
        System.out.println("圆形...");
    }
}
