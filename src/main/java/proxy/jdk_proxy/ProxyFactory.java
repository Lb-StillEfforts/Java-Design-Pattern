package proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    // 给目标对象生成一个代理对象
    public Object getProxyInstance() {
        /*     public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
               ClassLoader loader - 类加载器，获取方式固定
               Class<?>[] interfaces - 目标对象所实现的接口类型，使用泛型确认类型
               InvocationHandler h  - 事件处理，执行目标对象的方法时，会触发事件处理器方法
                                     （也就是说这里需要传入一个实现了InvocationHandler接口的类）
                                      同时会把当前执行的目标对象方法作为参数传入
                    */
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() { // 匿名内部类
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理开始 >>> ");
                        Object resultObj = method.invoke(object, args);
                        System.out.println("动态代理执行方法完毕.");

                        return resultObj;
                    }
                });
    }
}
