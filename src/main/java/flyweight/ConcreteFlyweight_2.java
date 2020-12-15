package flyweight;

public class ConcreteFlyweight_2 implements Flyweight {

    private String key;

    public void method(UnshareFlyweight unshareFlyweight) {
        System.out.println(getKey() + "被" + unshareFlyweight.getName() + "使用了...");
    }

    public ConcreteFlyweight_2() {
    }

    public ConcreteFlyweight_2(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
