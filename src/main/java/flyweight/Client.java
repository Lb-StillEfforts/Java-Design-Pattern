package flyweight;

public class Client {

    public static void main(String[] args) {
        UnshareFlyweight unshareFlyweight = new UnshareFlyweight("tom");

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fly1 = factory.getFlyweight("fly1");
        Flyweight fly2 = factory.getFlyweight("fly2");
        Flyweight fly3 = factory.getFlyweight("fly2");

        fly1.method(unshareFlyweight);
        fly2.method(unshareFlyweight);
        fly3.method(unshareFlyweight);

        System.out.println("totol object is : " + factory.getCount());
    }
}
