package flyweight;

public class UnshareFlyweight {

    private String name;

    public UnshareFlyweight(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
