package singleton;

/**
 * 饿汉式（静态代码块）
 */
public class Singleton_2 {

    // 1. 私有化构造器
    private Singleton_2() {}

    // 2. 本类内部创建静态常量型实例
    private static Singleton_2 instance;

    static {
        instance = new Singleton_2();
    }

    // 3. 对外提供公有的获取实例方法
    public static Singleton_2 getInstance() {
        return instance;
    }
}
