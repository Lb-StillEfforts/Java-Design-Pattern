package factory.abstractfactory.order;

import factory.abstractfactory.pizza.GreekPizza;
import factory.abstractfactory.pizza.PepperPizza;
import factory.abstractfactory.pizza.Pizza;

public class SHFactory implements AbstractFactory{

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("abstract factory pattern is used .");

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

        if (pizza != null) {
            pizza.setLocation("上海");
        }
        return pizza;
    }
}
