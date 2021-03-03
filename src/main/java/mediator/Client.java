package mediator;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteServer_1 server_1 = new ConcreteServer_1(mediator, "server_1");
        ConcreteServer_2 server_2 = new ConcreteServer_2(mediator, "server_2");

        server_1.sendMessage(0);
        server_2.sendMessage(1);

        mediator.sendMessage();

        Thread.sleep(3000);

        server_1.sendMessage(1);
        mediator.sendMessage();
    }
}
