package singleton;

/**
 * 饿汉式（静态变量）
 */
public class Singleton_1 {
    // 1. 私有化构造器
    private Singleton_1() {}

    // 2. 本类内部创建静态常量型实例
    private final static Singleton_1 instance = new Singleton_1();

    // 3. 对外提供公有的获取实例方法
    public static Singleton_1 getInstance() {
        return instance;
    }

}


