package adapter.adapter_object;

public class Client {
    public static void main(String[] args) {

        System.out.println("=== 对象适配器模式 ===");
        Monitor monitor = new Monitor();
        Adapter adapter = new Adapter(new Laptop());

        monitor.useAdapter(adapter);
    }
}
