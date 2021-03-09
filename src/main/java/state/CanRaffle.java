package state;

import java.util.Random;

public class CanRaffle implements State {

    Activity activity;

    public CanRaffle(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣除了积分~请等待抽奖结果~");
    }

    @Override
    public boolean raffle() {

        System.out.println("正在抽奖，请稍等~");
        Random random = new Random();
        int num = random.nextInt(10);
        // 10 % 几率
        if (num == 0) {
            // 中奖
            System.out.println("恭喜中奖~");
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有中奖~");
            activity.setState(activity.getNoRaffle());
            return false;
        }

    }

    @Override
    public void dispensePrize() {
        System.out.println("未中奖~");
    }
}
