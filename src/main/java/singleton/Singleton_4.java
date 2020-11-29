package singleton;

/**
 * 懒汉式（懒汉式-线程安全）
 */
public class Singleton_4 {

    private static Singleton_4 instance;

    private Singleton_4(){}

    // 对外提供一个静态方法。 仅有在被使用时才创建
    // 加入 synchronized 关键字， 解决线程安全问题
    public static synchronized Singleton_4 getInstance() {
        if (instance == null) {
            instance = new Singleton_4();
        }

        return instance;
    }


}
