package factory.simplefactory.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("正在给" + pizzaName + "准备原材料...");
    }

}
