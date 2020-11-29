package factory.factorymethod;

public class ConcreteFactory_1 implements AbstractFactory {
    public Produce newProduce() {
        System.out.println("concrete factory_1 create concrete produce_1");
        return new ConcreteProduce_1();
    }
}
