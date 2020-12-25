package proxy.jdk_proxy;

public class DAOImpl implements InterfaceDAO {

    @Override
    public void show() {
        System.out.println("--- 动态代理|show()被调用 ---");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("--- 动态代理|sayHello()被调用 ---");
        System.out.println("Hello, " + name + "!");
    }


}
