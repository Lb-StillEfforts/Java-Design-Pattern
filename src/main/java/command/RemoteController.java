package command;

// 遥控器
public class RemoteController {

    Command[] onCommands;
    Command[] offCommands;
    // 执行撤销的命令
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 设置按钮
    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    // 按下开按钮
    public void onButtonWasPushed(int index) {
        onCommands[index].execute();

        // 记录这次操作用于撤销
        undoCommand = onCommands[index];
    }

    // 按下关按钮
    public void offButtonWasPushed(int index) {
        offCommands[index].execute();

        // 记录这次操作用于撤销
        undoCommand = offCommands[index];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
