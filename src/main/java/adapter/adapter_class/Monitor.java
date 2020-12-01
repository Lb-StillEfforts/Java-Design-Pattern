package adapter.adapter_class;

/* 需求：将显示器解到只有usb接口的电脑上 */
public class Monitor {

    private String port = "HDMI";

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void useAdapter(TransferLine transferLine) {
        System.out.println("提供接口为: " + transferLine.provideHDMI());

        if (transferLine.provideHDMI().equals(this.port)) {
            System.out.println("连接成功。");
        }
        else {
            System.out.println("转接失败，请换一个类型");
        }
    }
}
