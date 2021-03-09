package state;

public class Activity {

    // 活动当前状态
    private State state;
    // 奖品数量
    private int count;
    // 四种状态
    NoRaffle noRaffle = new NoRaffle(this);
    CanRaffle canRaffle = new CanRaffle(this);

    DispenseState dispenseState = new DispenseState(this);
    DispenseOutState dispenseOutState = new DispenseOutState(this);

    // 初始化奖品数量，以及初始化状态为(不能抽奖状态)
    public Activity(int count) {
        this.state = getNoRaffle();
        this.count = count;
    }


    public void deductMoney() {
        this.state.deductMoney();
    }

    public void raffle() {
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public NoRaffle getNoRaffle() {
        return noRaffle;
    }

    public void setNoRaffle(NoRaffle noRaffle) {
        this.noRaffle = noRaffle;
    }

    public CanRaffle getCanRaffle() {
        return canRaffle;
    }

    public void setCanRaffle(CanRaffle canRaffle) {
        this.canRaffle = canRaffle;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public DispenseOutState getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(DispenseOutState dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
