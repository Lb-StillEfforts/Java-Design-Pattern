package factory.abstractfactory.order;

import factory.abstractfactory.pizza.Pizza;

import java.util.Scanner;

public class OrderPizza {

    AbstractFactory factory;
    Pizza pizza = null;

    public OrderPizza(AbstractFactory factory) {
        order(factory);
    }

    public void order(AbstractFactory factory) {
        this.factory = factory;
        do {
            this.pizza = this.factory.createPizza(getType());
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
