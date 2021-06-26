package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;

public enum SingletonEnum {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok~");
    }
}

class Test_Enum {
    public static void main(String[] args) throws Exception{
        SingletonEnum instance_1 = SingletonEnum.INSTANCE;
        SingletonEnum instance_2 = SingletonEnum.INSTANCE;
        System.out.println("正常情况下，两个对象是否相同? " + (instance_1 == instance_2));

        // 使用反射
//        Constructor<SingletonEnum> constructor = SingletonEnum.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        SingletonEnum newInstance = constructor.newInstance();
//        System.out.println("使用反射，能否创建不同实例?" + (instance_1 == newInstance));


        Constructor<SingletonEnum> constructor = SingletonEnum.class.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        SingletonEnum newInstance = constructor.newInstance("Test1", 11);
        System.out.println("使用反射，能否创建不同实例?" + (instance_1 == newInstance));

    }
}