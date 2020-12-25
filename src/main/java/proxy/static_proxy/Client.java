package proxy.static_proxy;

public class Client {

    public static void main(String[] args) {
        DAOImpl dao = new DAOImpl();
        DAOProxy daoProxy = new DAOProxy(dao);

        daoProxy.show();
    }
}
