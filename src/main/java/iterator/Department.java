package iterator;

// 系
public class Department {

    private String name;
    private String descript;

    public Department(String name, String descript) {
        this.name = name;
        this.descript = descript;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }
}
