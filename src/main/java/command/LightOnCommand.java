package command;

// 电灯的打开操作
public class LightOnCommand implements Command{


    LightReceiver lightReceiver;

    // 构造器初始化聚合的 LightReceiver
    public LightOnCommand(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
