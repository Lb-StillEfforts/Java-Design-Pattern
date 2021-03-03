package visitor;

public class Man extends Person {

    @Override
    void accept(Visitor visitor) {
        visitor.getResult(this);
//        visitor.getManResult(this); 对应第二种写法
    }
}
