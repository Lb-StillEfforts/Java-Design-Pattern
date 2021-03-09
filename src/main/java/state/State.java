package state;

public interface State {

    // 扣除积分
    void deductMoney();

    // 抽奖
    boolean raffle();

    // 发放奖品
    void dispensePrize();
}
