package visitor;

public class Client {

    public static void main(String[] args) {

        ObjectStructrue objectStructrue = new ObjectStructrue();

        Man man = new Man();
        Woman woman = new Woman();

        objectStructrue.attach(man);
        objectStructrue.attach(woman);

        System.out.println("------------------分界线------------------");
        Success success = new Success();
        // 个人理解：传入一种“操作”来对数据结构进行操作
        objectStructrue.display(success);

        System.out.println("------------------分界线------------------");
        Fail fail = new Fail();
        objectStructrue.display(fail);

        System.out.println("------------------分界线------------------");
        Wait wait = new Wait();
        objectStructrue.display(wait);
    }
}
