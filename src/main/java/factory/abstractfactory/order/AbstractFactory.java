package factory.abstractfactory.order;

import factory.abstractfactory.pizza.Pizza;

public interface AbstractFactory {

    public Pizza createPizza(String orderType);

}
