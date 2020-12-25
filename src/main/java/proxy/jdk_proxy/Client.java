package proxy.jdk_proxy;

public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        InterfaceDAO target = new DAOImpl();
        //
        InterfaceDAO proxyInstance = (InterfaceDAO) new ProxyFactory(target).getProxyInstance();

//        System.out.println("proxyInstance = " + proxyInstance.getClass());
        proxyInstance.show();
        proxyInstance.sayHello("tom");
    }
}
