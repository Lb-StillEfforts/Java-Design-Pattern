package observer;

public class WebSite implements Observer {
    // 温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        display();
    }

    private void display() {
        System.out.println("===XX网站:今日天气===");
        System.out.println("***Today temperature: "+ this.temperature +" ***");
        System.out.println("***Today pressure: "+ this.pressure +" ***");
        System.out.println("***Today humidity: "+ this.humidity +" ***");
    }
}
