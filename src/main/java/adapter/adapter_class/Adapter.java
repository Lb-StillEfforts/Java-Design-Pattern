package adapter.adapter_class;

public class Adapter extends Laptop implements TransferLine {

    public Adapter() {
        provideHDMI();
    }

    public String provideHDMI() {
        setPort("HDMI");

        return getPort();
    }

}
