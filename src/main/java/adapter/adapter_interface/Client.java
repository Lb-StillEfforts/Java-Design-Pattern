package adapter.adapter_interface;

/*  不想实现所有接口时,只需实现我们想要的方法就好 */
public class Client {

    public static void main(String[] args) {
        new AbstractAdapter(){
            @Override
            public void fun1() {
                System.out.println("=== 接口适配器 ===");
            }
        };
    }
}
