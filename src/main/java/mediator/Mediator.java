package mediator;

// 中介者-接口
// 负责调用各个服务者，处理服务者之间的消息，完成整个业务
public interface Mediator {

    void register(String serverName, Server server);

    void getMessage(int stateChange, String ServerName);

    void sendMessage();
}
