package bridge;

public class Square extends Shape {


    public Square(Color color) {
        super(color);
    }

    public void printShape() {
        super.printColor();
        System.out.println("正方形...");
    }
}
