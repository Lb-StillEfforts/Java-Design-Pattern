package builder;

public class Client {

    public static void main(String[] args) {
        /* 构建一台低配电脑 */
        Computer_v1 computer_v1 = new Computer_v1();
        Director director = new Director(computer_v1);
        Computer myComputer = director.constructComputer();
        System.out.println("myComputer => " + myComputer);

        /* 使用set换一个构建方式 */
        Computer_v2 computer_v2 = new Computer_v2();
        director.setComputerBuilder(computer_v2);
        Computer myDream = director.constructComputer();
        System.out.println("my Dream Computer => " + myDream);
    }
}
