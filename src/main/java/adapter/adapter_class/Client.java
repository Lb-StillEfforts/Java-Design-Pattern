package adapter.adapter_class;

public class Client {
    public static void main(String[] args) {

        System.out.println("=== 类适配器模式 ===");
        Monitor monitor = new Monitor();
        Adapter adapter = new Adapter();

        monitor.useAdapter(adapter);
    }
}
