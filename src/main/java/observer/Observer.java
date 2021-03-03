package observer;

// 观察者接口
public interface Observer {

    // 更新 温度、气压、湿度
    void update(float temperature, float pressure, float humidity);
}
