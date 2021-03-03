package observer;

public class Client {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentCondition currentCondition = new CurrentCondition();

        // 注册一个观察者
        weatherData.registerObserver(currentCondition);

        WebSite webSite = new WebSite();

        // 再注册一个观察者
        weatherData.registerObserver(webSite);


        weatherData.setData(10f,100f,30.5f);

    }
}
