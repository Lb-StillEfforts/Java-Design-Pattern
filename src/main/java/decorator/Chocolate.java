package decorator;

/* 具体的调味品 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDesc(" 巧克力 ");
        setPrice(2.0f); // 调味品的价格
    }

    public void addBitter() {
        System.out.println("巧克力给咖啡添加了一点点苦味");
    }
}
