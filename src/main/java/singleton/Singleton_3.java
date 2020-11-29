package singleton;

/**
 * 懒汉式（懒汉式-线程不安全）
 */
public class Singleton_3 {

    private static Singleton_3 instance;

    private Singleton_3(){}

    // 对外提供一个静态方法。 仅有在被使用时才创建
    public static Singleton_3 getInstance() {
        if (instance == null) {
            instance = new Singleton_3();
        }

        return instance;
    }


}
