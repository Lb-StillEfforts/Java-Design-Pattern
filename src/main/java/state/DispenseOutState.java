package state;

public class DispenseOutState implements State {

    Activity activity;

    public DispenseOutState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品已发完，请等待下次活动~");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已发完，请等待下次活动~");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已发完，请等待下次活动~");
    }
}
