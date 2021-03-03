package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    // 温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;
    // 观察者集合
    private ArrayList<Observer> observers;


    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 调用dataChange 将最新消息推送给接入方
        notifyObserver();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // 遍历所有的观察者，并通知
    @Override
    public void notifyObserver() {

        for (Observer observer : observers) {
            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
