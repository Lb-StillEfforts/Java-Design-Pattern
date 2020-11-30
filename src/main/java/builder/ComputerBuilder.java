package builder;

public abstract class ComputerBuilder {

    protected Computer computer = new Computer();

    public abstract void setCPU();

    public abstract void setGPU();

    public abstract void setRAM();

    public abstract void setROM();

    public Computer buildComputer() {

        return this.computer;
    }

}
