package proxy.cglib_proxy;

public class Client {

    public static void main(String[] args) {

        Target target = new Target();
        Target cglibProxy = (Target) new CglibProxy(target).getProxyInstance();

        cglibProxy.show();

    }
}
