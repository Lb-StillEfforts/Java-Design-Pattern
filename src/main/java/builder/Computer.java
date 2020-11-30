package builder;

/**
 * Product - 产品类型 */
public class Computer {
    /* 以下属性也可以是引用类型, 仅使用普通变量做演示 */
    private String cpu; // cpu 型号
    private String gpu; // 显卡型号
    private String ram; // 运行内存大小
    private String rom; // 存储内存大小

    public Computer() {
    }

    public Computer(String cpu, String gpu, String ram, String rom) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + cpu + '\'' +
                ", GPU='" + gpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", ROM='" + rom + '\'' +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }
}
