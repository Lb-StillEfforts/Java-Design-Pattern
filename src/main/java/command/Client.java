package command;

public class Client {

    public static void main(String[] args) {

        // 使用命令模式完成对电灯的操作
        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 遥控器
        RemoteController remoteController = new RemoteController();
        // 将第一组开关设置为电灯的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("----------按下开灯----------");
        remoteController.onButtonWasPushed(0);
        System.out.println("----------按下关灯----------");
        remoteController.offButtonWasPushed(0);
        System.out.println("----------按下撤销----------");
        remoteController.undoButtonWasPushed();
    }
}
