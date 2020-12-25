package proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/* Cglib 代理
*  1. 静态代理和JDK代理都要求目标类实现接口，
*     当目标类没有实现接口时，使用Cglib通过目标对象的子类来代理
*  2. 目标类不能为final*/
public class CglibProxy implements MethodInterceptor {

    // 目标类
    private Object target;

    public CglibProxy(Object object) {
        this.target = object;
    }

    // 返回从构造器传入的 target 的代理对象
    public Object getProxyInstance() {
        // 1. 创建工具类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开始 >>> ");
        Object resultObj = method.invoke(target, args);
        System.out.println("Cglib代理模式结束 。 ");
        return resultObj;
    }
}
