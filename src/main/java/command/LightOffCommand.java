package command;

// 电灯的关闭操作
public class LightOffCommand implements Command {


    LightReceiver lightReceiver;

    // 构造器初始化聚合的 LightReceiver
    public LightOffCommand(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
