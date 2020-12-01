package adapter.adapter_class;

public class Laptop {

    private String port = "USB";

    public void usb() {
        System.out.println("只对外提供usb接口");
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
