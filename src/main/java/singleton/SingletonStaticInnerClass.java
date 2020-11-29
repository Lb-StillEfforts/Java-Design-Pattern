package singleton;

public class SingletonStaticInnerClass {

    private SingletonStaticInnerClass() {}

    // 利用jvm的静态内部类的特性来完成单例模式
    private static class SingletonInstance {
        private final static SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    public static SingletonStaticInnerClass getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

class Test01 {
    public static void main(String[] args) {
        SingletonStaticInnerClass instance_1 = SingletonStaticInnerClass.getInstance();
        SingletonStaticInnerClass instance_2 = SingletonStaticInnerClass.getInstance();
        System.out.println(instance_1 == instance_2);
        System.out.println("instance_1 hashcode is : " + instance_1.hashCode());
        System.out.println("instance_2 hashcode is : " + instance_2.hashCode());
    }
}
