package singleton;

public enum SingletonEnum {
    INSTANCE;
    public void sayOK() {
        System.out.println("ok~");
    }
}

class Test_Enum {
    public static void main(String[] args) {
        SingletonEnum instance_1 = SingletonEnum.INSTANCE;
        SingletonEnum instance_2 = SingletonEnum.INSTANCE;
        System.out.println(instance_1 == instance_2);
        System.out.println("instance_1 hashcode is : " + instance_1.hashCode());
        System.out.println("instance_2 hashcode is : " + instance_2.hashCode());
    }
}