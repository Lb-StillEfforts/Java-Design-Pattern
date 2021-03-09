package state;

public class Client {

    public static void main(String[] args) {
        Activity activity = new Activity(1);

        for (int i = 0; i < 30; i++) {
            System.out.printf("----------第%d次抽奖----------\n", i + 1);
            activity.deductMoney();
            activity.raffle();
        }
    }
}
