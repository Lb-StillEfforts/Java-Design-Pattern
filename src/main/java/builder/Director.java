package builder;

public class Director {

    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    /* 如果我要换一个方案，则只需SET，无需再new */
    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer constructComputer() {
        /* 构建顺序如下 */
        this.computerBuilder.setCPU();
        this.computerBuilder.setGPU();
        this.computerBuilder.setRAM();
        this.computerBuilder.setROM();

        return this.computerBuilder.buildComputer();
    }

}
