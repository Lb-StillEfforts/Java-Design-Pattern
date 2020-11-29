package singleton;

/**
 * 双重检测式
 */
public class SingletonDoubleCheck {

    private static volatile SingletonDoubleCheck instance;

    private SingletonDoubleCheck(){}

    // 对外提供一个静态方法。 仅有在被使用时才创建
    // 加入 synchronized 关键字， 解决线程安全问题
    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class){
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }

        return instance;
    }

}
