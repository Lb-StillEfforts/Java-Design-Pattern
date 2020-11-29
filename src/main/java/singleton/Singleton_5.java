package singleton;

/**
 * 懒汉式（懒汉式-同步代码块-线程不安全）
 */
public class Singleton_5 {

    private static Singleton_5 instance;

    private Singleton_5(){}

    // 对外提供一个静态方法。 仅有在被使用时才创建
    // 以下方式解决不了线程安全
    public static Singleton_5 getInstance() {
        if (instance == null) {
            synchronized (Singleton_5.class){
                instance = new Singleton_5();
            }
        }

        return instance;
    }

}
