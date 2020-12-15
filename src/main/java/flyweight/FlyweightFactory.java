package flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {

        if (flyweights.containsKey(key)){
            return flyweights.get(key);
        }
        else if (key.equals("fly1")) {
            Flyweight flyweight = new ConcreteFlyweight_1(key);
            flyweights.put(key, flyweight);
        }
        else if (key.equals("fly2")) {
            Flyweight flyweight = new ConcreteFlyweight_2(key);
            flyweights.put(key, flyweight);
        }
        else {
            return null;
        }

        return flyweights.get(key);
    }

    public int getCount() {
        return flyweights.size();
    }
}
