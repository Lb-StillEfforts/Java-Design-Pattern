package proxy.static_proxy;

public class DAOImpl implements InterfaceDAO {

    @Override
    public void show() {
        System.out.println("--- 静态代理|目标对象被调用 ---");
    }
}
