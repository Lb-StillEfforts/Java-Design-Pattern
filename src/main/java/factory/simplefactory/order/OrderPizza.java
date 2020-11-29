package factory.simplefactory.order;

import factory.simplefactory.pizza.Pizza;

import java.util.Scanner;

public class OrderPizza {

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        order(simpleFactory);
    }

    public void order(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        do {
            this.pizza = this.simpleFactory.createPizza(getType());
            if (this.pizza != null) {
                this.pizza.prepare();
                this.pizza.commonFun();
            }
        } while (this.pizza != null);
    }

    private String getType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input type of pizza, please: ");
        return sc.nextLine();
    }

}
