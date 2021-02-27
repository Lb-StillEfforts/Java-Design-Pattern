package visitor;

public class Wait implements Visitor {
    @Override
    public void getResult(Person person) {
        if (person instanceof Man) {
            System.out.println("男性对此的评价为:待定");
        }
        else if (person instanceof Woman) {
            System.out.println("女性对次的评价为:待定");
        }
        else {
            System.out.println("****************");
        }
    }
}
