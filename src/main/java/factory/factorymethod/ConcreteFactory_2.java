package factory.factorymethod;

public class ConcreteFactory_2 implements AbstractFactory {
    public Produce newProduce() {
        System.out.println("concrete factory_2 create concrete produce_2");
        return new ConcreteProduce_2();
    }
}
