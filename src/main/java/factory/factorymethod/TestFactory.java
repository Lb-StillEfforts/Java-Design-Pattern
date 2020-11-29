package factory.factorymethod;

public class TestFactory {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory_1();
        Produce produce = factory.newProduce();
        produce.show();
    }
}
