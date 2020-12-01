package adapter.adapter_object;

public class Adapter implements TransferLine {

    private Laptop laptop;

    public Adapter(Laptop laptop) {
        this.laptop = laptop;
    }

    public String provideHDMI() {
        if (laptop != null) {
            laptop.setPort("HDMI");
        }

        return laptop.getPort();
    }

}
