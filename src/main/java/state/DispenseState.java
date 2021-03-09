package state;

public class DispenseState implements State {

    Activity activity;

    public DispenseState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能抽除积分~");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖~");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("领奖ing~");
            if (activity.getCount() <= 0) {
                activity.setState(activity.getDispenseOutState());
            } else {
                activity.setState(activity.getNoRaffle());
            }

        } else {
            System.out.println("很遗憾，奖品发完了~");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
