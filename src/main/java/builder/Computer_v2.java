package builder;

public class Computer_v2 extends ComputerBuilder {

    @Override
    public void setCPU() {
        this.computer.setCpu("i9-*");
    }

    @Override
    public void setGPU() {
        this.computer.setGpu("RTX 3090");
    }

    @Override
    public void setRAM() {
        this.computer.setRam("16G");
    }

    @Override
    public void setROM() {
        this.computer.setRom("固态-256G，机械-1T");
    }
}
