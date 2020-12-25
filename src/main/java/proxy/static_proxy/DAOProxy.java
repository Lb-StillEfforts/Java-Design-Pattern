package proxy.static_proxy;

public class DAOProxy implements InterfaceDAO{

    private DAOImpl dao;

    public DAOProxy(DAOImpl dao) {
        this.dao = dao;
    }

    @Override
    public void show() {
        System.out.println("开始代理 >>>"); // 这里可以调用其他方法，完成目标方法执行前的验证，这就是切入式编程
        this.dao.show();
        System.out.println("代理结束 ...");
    }
}
