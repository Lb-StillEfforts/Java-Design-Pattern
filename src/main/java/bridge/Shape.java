package bridge;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    protected void  printColor() {
        this.color.printColor();
    }

    abstract void printShape();
}
