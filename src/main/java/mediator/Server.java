package mediator;

// 服务提供者-抽象类
public abstract class Server {

    private Mediator mediator;
    public String name;
    private int state; // 0 未完成， 1 完成

    public Server(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
