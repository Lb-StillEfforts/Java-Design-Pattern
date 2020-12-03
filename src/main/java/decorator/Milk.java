package decorator;

/* 具体的调味品 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDesc(" 牛奶 ");
        setPrice(3.0f); // 调味品的价格
    }

    public void addSweet() {
        System.out.println("牛奶给咖啡加了点甜味");
    }
}
