package mediator;

public class ConcreteServer_1 extends Server {

    public ConcreteServer_1(Mediator mediator, String name) {
        super(mediator, name);
        // 在中介者中注册自己
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
