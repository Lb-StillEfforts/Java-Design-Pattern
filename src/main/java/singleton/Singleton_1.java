package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 饿汉式（静态变量）
 */
public class Singleton_1 {

    // 防止反射破坏
    private static boolean flag = true;

    // 1. 私有化构造器
    private Singleton_1() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单例模式遇到攻击，第二个对象未创建成功");
        }
    }

    // 2. 本类内部创建静态常量型实例
    private final static Singleton_1 instance = new Singleton_1();

    // 3. 对外提供公有的获取实例方法
    public static Singleton_1 getInstance() {
        return instance;
    }

}

class Test {
    public static void main(String[] args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException,
            InstantiationException, NoSuchFieldException {
        // 使用反射破坏单例模式
        Singleton_1 instance = Singleton_1.getInstance();
        // 破解私有构造器
        Class<? extends Singleton_1> singleton_class = instance.getClass();
        Constructor<? extends Singleton_1> constructor = singleton_class.getDeclaredConstructor();
        constructor.setAccessible(true);
//        // 获取flag字段 - 破解flag验证
        Field flag = singleton_class.getDeclaredField("flag");
        flag.setAccessible(true);
        System.out.println(flag.get(instance));
        flag.set(instance, true); // 修改flag值为true
        System.out.println(flag.get(instance));

        // 修改后成功创建了新的实例
        Singleton_1 singleton_1 = constructor.newInstance();
        System.out.println("创建新实例成功，破解成功...");
        System.out.println(instance.hashCode());
        System.out.println(singleton_1.hashCode());
        System.out.println(instance == singleton_1);
    }
}


