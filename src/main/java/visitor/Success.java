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
}
