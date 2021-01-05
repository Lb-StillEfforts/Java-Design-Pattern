package template;

public class Client {

    public static void main(String[] args) {
        ConcreteA a = new ConcreteA();
        a.template();

        ConcreteB b = new ConcreteB();
        b.template();
    }
}
