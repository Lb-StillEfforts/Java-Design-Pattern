package state;

public class NoRaffle implements State{

    // 初始化时传入活动引用，扣除积分后改变其状态
    Activity activity;

    public NoRaffle(Activity activity) {
        this.activity = activity;
    }

    // 当前状态可以尝试扣除积分来转换状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了~");
        activity.setState(activity.getCanRaffle());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣除了积分才能抽奖哟");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("未中奖~");
    }
}
