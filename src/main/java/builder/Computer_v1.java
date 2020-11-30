package builder;

public class Computer_v1 extends ComputerBuilder {

    @Override
    public void setCPU() {
        this.computer.setCpu("i5-*");
    }

    @Override
    public void setGPU() {
        this.computer.setGpu("GTX 980");
    }

    @Override
    public void setRAM() {
        this.computer.setRam("8g");
    }

    @Override
    public void setROM() {
        this.computer.setRom("固态-无，机械-1T");
    }
}
