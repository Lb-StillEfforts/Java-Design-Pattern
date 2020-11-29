package factory.simplefactory.order;

import factory.simplefactory.pizza.GreekPizza;
import factory.simplefactory.pizza.PepperPizza;
import factory.simplefactory.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("simple factory pattern is used .");

        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setPizzaName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")){
            pizza = new GreekPizza();
            pizza.setPizzaName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setPizzaName(" 胡椒披萨 ");
        }

        return pizza;
    }
}
