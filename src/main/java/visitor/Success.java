package visitor;

public class Success implements Visitor {

    @Override
    public void getResult(Person person) {
        if (person instanceof Man) {
            System.out.println("男性对此的评价为:成功");
        }
        else if (person instanceof Woman) {
            System.out.println("女性对次的评价为:成功");
        }
        else {
            System.out.println("****************");
        }

    }

//    对应第二种写法
//    @Override
//    public void getManResult(Person person) {
//        System.out.println("男性对此的评价为:成功");
//    }
//
//    @Override
//    public void getWomanResult(Person person) {
//        System.out.println("女性对次的评价为:成功");
//    }
}
