package mediator;

import java.util.HashMap;

public class ConcreteMediator implements Mediator {

    // 中介者列表
    private HashMap<String, Server> serverMap;
    // 服务状态列表
    private HashMap<String, Integer> stateMap;

    public ConcreteMediator() {
        serverMap = new HashMap<>();
        stateMap = new HashMap<>();
    }

    @Override
    public void register(String serverName, Server server) {
        if (!serverMap.containsKey(serverName)) {
            serverMap.put(serverName, server);
        }
    }

    @Override
    public void getMessage(int stateChange, String serverName) {
        stateMap.put(serverName, stateChange);

    }


    @Override
    public void sendMessage() {
        int flag = 1;
        for (String serverName:this.stateMap.keySet()) {
            if (this.stateMap.get(serverName) == 1) {
                System.out.println(serverName + " 已完成");
            }
            else {
                System.out.println(serverName + " 未完成");
                flag = 0;
            }
        }

        if (flag == 1) {
            System.out.println("全部服务已完成...");
        }
    }
}
