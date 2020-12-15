package flyweight;

public class ConcreteFlyweight_1 implements Flyweight {

    private String key;

    public void method(UnshareFlyweight unshareFlyweight) {
        System.out.println(getKey() + "被" + unshareFlyweight.getName() + "使用了...");
    }

    public ConcreteFlyweight_1() {
    }

    public ConcreteFlyweight_1(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
