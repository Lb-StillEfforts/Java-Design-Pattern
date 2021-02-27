package visitor;

public class Fail implements Visitor {

    @Override
    public void getResult(Person person) {
        if (person instanceof Man) {
            System.out.println("男性对此的评价为:失败");
        }
        else if (person instanceof Woman) {
            System.out.println("女性对次的评价为:失败");
        }
        else {
            System.out.println("****************");
        }
    }
}
